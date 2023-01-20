package com.belajar;

public class OrangTua extends Kakek {

    String mobil = "avansa";
    String rumah = "rumah mewah";

    public OrangTua(){
        super("jangan lupakan sejarah"); // ini adalah cara untuk memanggil construktor yang memiliki parameter.
        System.out.println("ini adalah kostruktor...");
    }

    public void sayaAdalah(){
        System.out.println("Saya adalah orang tua");
    }
}
