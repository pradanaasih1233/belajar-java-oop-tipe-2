package com.belajar.orang;

// ini adalah cara untuk menggunakan abstract class.
public class Warga extends abstrsctOrang {

    @Override
    public void display() {
        System.out.println("\n--------------------------");
        System.out.println("Identitas warga");
        System.out.println("--------------------------");
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Negara : " + negara);
        System.out.println("*dari run method");
    }
}
