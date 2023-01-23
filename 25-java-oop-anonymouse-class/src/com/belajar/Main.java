// ANONYMOUSE CLASS

/*------------------------------------------------------------
*| ANONYMOUSE CLASS
*|------------------------------------------------------------
*|  Merupakan cara untuk membuat class langsung dari class main
*| dan merupakan bagian dari innerclass.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 25 anonymouse class");

        // cara buat anonymouse class.
        Presiden presiden = new Presiden(){
            @Override
            public void sapaPresiden() {
                System.out.println("hallo pak presiden");
            }
        };

        // panggil method.
        presiden.sapaPresiden();

    }
}