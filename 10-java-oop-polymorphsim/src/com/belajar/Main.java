// PLYMORPHISM

// Polymorphism berarti banyak bentuk, atau kemampuan sebuah objek untuk berubah bentuk menjadi bentuk lain.
// Memiliki keterkaitan dengan Inheritance.

/*------------------------------------------------------------
 *| PLYMORPHISM
 *|------------------------------------------------------------
 *|  Polymorphism berarti banyak bentuk,
 *| atau kemampuan sebuah objek untuk berubah bentuk.
 */

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 10 belajar polymorphism");

        // contoh :
        // ini adalah cara merubah bentuk.
        Kakek kakek = new Kakek("saya jarat");
        siapaSaya(kakek);

        // objek kakek berubah.
        kakek = new OrangTua();
        siapaSaya(kakek);

        // objek kakek brubah.
        kakek = new Orang("jarat","kulonprogo",true);
        siapaSaya(kakek);


    }

    public static void siapaSaya(Kakek kakek){
        System.out.println("---------------------------");
        kakek.sayaAdalah();
        System.out.println("---------------------------");
    }

}
