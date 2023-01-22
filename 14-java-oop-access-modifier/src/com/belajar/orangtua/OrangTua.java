package com.belajar.orangtua;

import com.belajar.kakek.Kakek; // alamat bila kita akan akses file

public class OrangTua extends Kakek {

    String mobil = "avansa";
    String rumah = "rumah mewah";

    public OrangTua(){
        super("jangan lupakan sejarah"); // ini adalah cara untuk memanggil construktor yang memiliki parameter.
    }

    public void sayaAdalah(){
        System.out.println("Saya adalah orang tua");
    }
}
