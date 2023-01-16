// METHOD

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 03 Method");

        // membuat object
        Orang orang = new Orang();

        // cara merubah nilai field
        orang.name = "yanto";
        orang.address = "kulon progo";
        // orang.country = "jepang"; <-- tidak dapat dirubah karena final.

        // cara akses field
        System.out.println("Nama   : " + orang.name);
        System.out.println("Alamat : " + orang.address);
        System.out.println("Negara : " + orang.country);

        // cara memanggil method
        System.out.println("Cara memanggil method");
        orang.menyapa();
    }
}