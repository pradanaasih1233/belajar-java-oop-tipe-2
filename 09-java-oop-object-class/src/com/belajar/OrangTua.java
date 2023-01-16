package com.belajar;

public class OrangTua extends Kakek {

    String mobil = "avansa";
    String rumah = "rumah mewah";

    public OrangTua(){
        super("jangan lupakan sejarah"); // ini adalah cara untuk memanggil construktor yang memiliki parameter.
        System.out.println("ini adalah kostruktor...");
    }

    public void Mobil(){
        System.out.println("Mendapat warisan Mobil dari orang tua");
    }

    public void rumah(){
        System.out.println("Menadapat warisan Rumah dari orang tua");
    }
}
