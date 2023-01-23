package com.belajar.orang;

// ini menandakan bahwa class ini umum.
public class Orang {

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

    public void sayaAdalah(){
        System.out.println("Saya adalah anak orang");
    }
}
