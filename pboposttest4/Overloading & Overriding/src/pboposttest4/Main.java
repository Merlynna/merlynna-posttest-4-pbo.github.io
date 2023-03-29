
//package : cara pengelompokkan kelas yang sekelompok menjadi suatu unit tunggal
package pboposttest4;

//publicclassMain : metode dengan nama Main Utama untuk menjalankan sebuah program
public class Main {

    //publicstaticvoidMain : method dalam bahasa Pemrograman Java untuk menjalankan suatu program
    public static void main(String[] args) throws Exception {
        //Overloading
        Overloading bt;
        bt = new Overloading();

        //bt : Barangan Tambah
        bt.Tambah();

        //Overriding
        Overriding bonekaproduk;
        bonekaproduk = new Overriding();

        OverridingSub subboneka;
        subboneka = new OverridingSub();

        System.out.println(bonekaproduk.CekInfor());
        System.out.println(subboneka.CekInfor());
    }
}
