
package pboposttest4;

class Overriding {
 //Overriding : method class turunan menimpa method milik parent class
  String CekInfor(){
    return "Ini punya Sistem Komputer";
  }
}

class OverridingSub extends Overriding {
  String CekInfor() {
    return "Ini berasal dari Sistem Laptop Toko";
  }
}