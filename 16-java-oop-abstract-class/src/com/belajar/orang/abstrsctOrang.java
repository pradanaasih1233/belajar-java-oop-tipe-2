// ini adalah class abstract dan hanya bisa diturunkan.
package com.belajar.orang;

public abstract class abstrsctOrang {

    public String nama;
    public String alamat;
    public final String negara = "indonesia";

    // ini adalah abstract method
    public abstract void display(); // ini wajib ditulis ulang di class turunaannya.
}
