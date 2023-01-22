package com.belajar.orangtua;

import com.belajar.kakek.Kakek;

// ini menandakan bahwa class ini umum.
public class OrangTua extends Kakek {

    String mobil = "avansa";
    String rumah = "rumah mewah";

    // ini menandakan construktor ini umum.
    public OrangTua(){
        super("jangan lupakan sejarah");
    }

    // ini menandakan method ini umum.
    public void sayaAdalah(){
        System.out.println("Saya adalah orang tua");
    }
}
