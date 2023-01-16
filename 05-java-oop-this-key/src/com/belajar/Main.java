// THIS KEY

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 05 this key");

        // membuat object.
        Orang orang = new Orang("yanto","Kulon Progo", true); // construktor akan berjalan disini.

        // cara memanggil method.
        System.out.println("Cara memanggil method");
        orang.menyapa();
    }
}