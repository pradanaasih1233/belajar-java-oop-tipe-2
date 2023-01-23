// FINAL CLASS

/*------------------------------------------------------------
*| FINAL CLASS
*|------------------------------------------------------------
*|  Merupakan class yang tidak dapat diturunkan lagi. Menggunakan
*| kata kunci final. Final dapat diterapan pada field, class dan
*| method. Apa pun yang memiliki atribute final maka akan terkunci.
*/

package com.belajar;

// pengunaan final dalam class.
final class Kucing{
    String nama;
    int massa;

    // final juga bisa untuk mengunci method parent.
    final void suara(){
        System.out.println("meoooowwww");
    }
}

// ini tidak dapat digunakan karena parent class adalah final.
// class robotKucing extends Kucing(){
//
// }

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 23 finall class");
    }
}