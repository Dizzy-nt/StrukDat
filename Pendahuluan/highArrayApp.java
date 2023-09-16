package Pendahuluan;
public class highArrayApp {
    public static void main(String[] args) {
        int maxSize=100;
        highArray arr;
        arr=new highArray(maxSize);
        
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);
        
        arr.display();
        
        int key=25;
        if (arr.find(key)) {
            System.out.println(key+" ditemukan dalam indeks");
        }else{
            System.out.println(key+" tidak ditemukan dalam indeks");
        }
        
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
        arr.display();
        arr.size();
    }
}
