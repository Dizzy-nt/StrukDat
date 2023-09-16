package Praktikum;
public class p1_array {
        private int[] arr;
    private int nElemen;
    public p1_array(int max) {
        arr = new int[max];
        nElemen =0;
    }
    public void insert(int value){
        arr[nElemen]=value;
        nElemen++;
    }
    public boolean find(int key){
        int i;
        for (i = 0; i < nElemen ; i++) {
            if (arr[i]==key) {
                break;
            }
        }
        if (i==nElemen) {
            return false;
        }else{
            return true;
        
        }
    }
    public boolean delete(int value){
        int i;
        for (i = 0; i <nElemen ; i++) {
            if (value==arr[i]) {
                break;
            }
        }
        if (i==nElemen) {
            return false;
        }else{
            for (int j = i; j < nElemen; j++) {
                arr[j]=arr[j+1];
            }
            nElemen--;
            return true;
        }
    }
    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public int size(){
        int size=nElemen;
        System.out.println("Jumlah elemen pada array adalah = "+size);
        return size;
    }
    public void insertOrdered(int value){
        int i;
        //Cari posisi yang sesuai
        for (i = 0; i < nElemen; i++) {
            if (value<arr[i]) {
                break;
            }
        }
        //Pindahkan value yang lebih besar ke kanan
        int j;
        for (j = nElemen; j > i; j--) {
            arr[j+1]=arr[j];
        }
        arr[j]=value;
        nElemen++;
    }
    public void sorting() {
        int dummy;
        for (int i = 0; i < nElemen-1; i++) {
            for (int j = i; j < nElemen; j++) {
                if (arr[i] > arr[j]) {
                    dummy = arr[i];
                    arr[i] = arr[j];
                    arr[j] = dummy;
                }
            }
        }
    }
    public boolean find_wBinarySearch(int x){
        int batasBawah;
        int batasAtas=nElemen;
        int curln=nElemen/2;
        for (int i = 0; i < batasAtas; i++) {
            if (x==arr[curln]) {
                break;
            }
            else if (x>arr[curln]) {
                batasBawah=curln;
            }else if(x<arr[curln]){
                batasAtas=curln;
            }
            curln=curln/2;
        }
        if (x==arr[curln]) {
            return true;
        }else{
            return false;
        }
    }
}
