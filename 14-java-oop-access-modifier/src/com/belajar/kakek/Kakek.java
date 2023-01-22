package com.belajar.kakek;

public class Kakek {

    String name;
    String address;

    // ini ada construktor.
    public Kakek(String kata){ // <<< bila ada parameter maka kita harus mengisi juga pada class turunannya.
        System.out.println("ini adalah konstruktor... kata kakek : \"" + kata);
    }

    public void sayaAdalah(){
        System.out.println("Saya adalah kakek");
    }
}
