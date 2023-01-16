// OVERLOADING

// dalam kasus ini adalah method yang dapat memiliki banyak variasi.

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 07 overloading");

        // membuat object.
        Orang orang = new Orang("yanto","Kulon Progo", true); // construktor akan berjalan disini.

        // cara akses overloading.
        orang.menyapa();               // tanpa overloading.
        orang.menyapa("jarat");  // dengan overloading.
    }
}