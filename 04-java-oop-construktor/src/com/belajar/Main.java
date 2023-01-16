// CONSTRUKTOR

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 04 Construktor");

        System.out.println("\nobjek 2");

        // membuat object 1.
        Orang orang = new Orang(); // construktor akan berjalan disini.

        // cara merubah nilai field
        orang.name = "yanto";
        orang.address = "kulon progo";
        // orang.country = "jepang"; <-- tidak dapat dirubah karena final.

        // cara akses field.
        System.out.println("Nama   : " + orang.name);
        System.out.println("Alamat : " + orang.address);
        System.out.println("Negara : " + orang.country);

        // cara memanggil method.
        System.out.println("Cara memanggil method");
        orang.menyapa();

        System.out.println("\nobjek 2");

        // membuat object 2.
        Orang orang2 = new Orang("tina","Kulon Progo",true); // construktor overload.

        // cara memanggil method.
        System.out.println("Cara memanggil method");
        orang2.menyapa();
    }
}