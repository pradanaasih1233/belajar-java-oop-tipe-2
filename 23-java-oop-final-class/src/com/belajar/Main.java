// FINAL CLASS

/*------------------------------------------------------------
*| FINAL CLASS
*|------------------------------------------------------------
*|  Merupakan class yang tidak dapat diturunkan lagi. Menggunakan
*| kata kunci final.
*/

package com.belajar;

// pengunaan final dalam class.
final class Kucing{
    String nama;
    int massa;
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