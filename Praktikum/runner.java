package Praktikum;
public class runner {
    public static void main(String[] args) {
        p1_array ar=new p1_array(16);
        ar.insert(70);
        ar.insert(80);
        ar.insert(75);
        ar.insert(55);
        ar.insert(85);
        ar.insert(25);
        ar.insert(30);
        ar.insert(00);
        ar.insert(90);
        ar.insert(40);
        ar.display();
        ar.insertOrdered(82);
        ar.display();
        ar.sorting();
        ar.display();
        int x=25;
        if (ar.find_wBinarySearch(x)) {
            System.out.println(x+" ditemukan dalam indeks");
        }else{
            System.out.println(x+" tidak ditemukan dalam indeks");
        }
    }
}
