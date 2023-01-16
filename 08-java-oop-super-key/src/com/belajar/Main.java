// SUPER KEY

// dalam kasus ini adalah cara untuk mengakses class atau method paling atas.

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 08 super key");

        // membuat object.
        Orang orang = new Orang("yanto","Kulon Progo", true); // construktor akan berjalan disini.

        // VVVVVVVV
        orang.rumah(); // maka ini akan mendapat warisan dari class OrangTua
        orang.Mobil(); // maka ini akan mendapat warisan dari class OrangTua
    }
}