package pboposttest4;

class Overloading {
 //Overloading : method dengan nama tetapi dengan parameter yang berbeda
 public void Tambah() {
  int a = 500;
  int b = 100;
  int c = 200;
  int d = 1000;

  System.out.println("Harga Barang 1 : " + a);
  System.out.println("Harga Barang 2 : " + b);
  System.out.println("Harga Barang 3 : " + c);
  System.out.println("Total          : " + (a + b + c));
  System.out.println("Selisih        : " + (d  - (a + b + c)));
  System.out.println( );
 }
}
