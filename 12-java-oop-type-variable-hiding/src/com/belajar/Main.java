// VARIABLE HIDING

// Dalam hal ini adalah cara untuk mengatasi nama variabel yang sama dalam turunan class.

/*------------------------------------------------------------
 *| VARIABLE HIDING
 *|------------------------------------------------------------
 *|  variable hiding akan terjadi bila ada turunan class yang
 *| yang memiliki nama variable yang sama dengan parent class.
 */

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 12 object variable hiding");

        Orang orang = new Orang("jarat","kulonprogo",true);
        orang.sayaAdalah();

        Kakek kakek = orang; // ini adalah yang menyebabkan nilai semakin kacau.
        kakek.sayaAdalah();  // ini akan akses ke child class.

        System.out.println(kakek.name); // ini akan null karena variable name di parent kosong.

    }
}