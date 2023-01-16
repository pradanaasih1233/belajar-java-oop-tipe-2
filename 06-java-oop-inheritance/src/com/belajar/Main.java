// INHERITANCE / PEWARISAN DALAM JAVA

// dalam kasus ini adalah class OrangTua akan mewariskan atributnya ke class Orang

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 06 inheritance");

        // membuat object.
        Orang orang = new Orang("yanto","Kulon Progo", true); // construktor akan berjalan disini.

        // VVVVVVVV
        orang.rumah(); // maka ini akan mendapat warisan dari class OrangTua
        orang.Mobil(); // maka ini akan mendapat warisan dari class OrangTua
    }
}