package com.belajar.orang;

import com.belajar.orangtua.OrangTua; // alamat bila kita akan akses file

// ini menandakan bahwa class ini umum.
public class Orang extends OrangTua {

    // membuat field.
    String name;
    String address;
    final String country = "indonesia";

    // ini menandakan construktor ini umum.
    public Orang(String name, String address, boolean tampilkan){
        System.out.println("ini adalah construktor yang akan dipanggil...");

        // ini adalah contoh penggunaan this key
        this.name = name;
        this.address = address;

        if (tampilkan) {
            // cara akses field.
            System.out.println("Nama   : " + this.name);
            System.out.println("Alamat : " + this.address);
            System.out.println("Negara : " + this.country);
        }
    }

    // ini menandakan method ini umum.
    public void sayaAdalah(){
        System.out.println("Saya adalah anak orang");
    }
}
