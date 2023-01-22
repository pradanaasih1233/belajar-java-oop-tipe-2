package com.belajar.kakek;

// ini menandakan bahwa class ini umum.
public class Kakek {

    String name;
    String address;

    // ini menandakan construktor ini umum.
    public Kakek(String kata){ // <<< bila ada parameter maka kita harus mengisi juga pada class turunannya.
        System.out.println("ini adalah konstruktor... kata kakek : \"" + kata);
    }

    // ini menandakan method ini umum.
    public void sayaAdalah(){
        System.out.println("Saya adalah kakek");
    }
}
