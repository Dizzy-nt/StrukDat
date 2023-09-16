package Pendahuluan;
public class classArray {
    /**
     *
     * @param args
     */
    void Array() {
        int[] array = new int[10];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        array[5]=50;
        int length = 5;
        for (int i = 0; i <length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        String[] arrayy=new String[1];
        for (int i = 0; i < arrayy.length; i++) {
            System.out.print(arrayy[i]+" ");
        }
    }
    void kelasArray(){
        int[] array = new int[100];
        int nElemen=0;
        array[0]=30;
        array[1]=20;
        array[2]=60;
        array[3]=70;
        array[4]=50;
        array[5]=10;
        nElemen = 6;
        for (int i = 0; i <nElemen; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}
