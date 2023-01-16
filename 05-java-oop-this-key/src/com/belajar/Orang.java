package com.belajar;

class Orang {

    // membuat field.
    String name;                        // ini field
    String address;                     // ini juga field
    final String country = "indonesia"; // ini juga field

    /*------------------------------------------------------------
     *| THIS KEY
     *|------------------------------------------------------------
     *|  This adalah cara untuk mengatasi variabel yang tertutup oleh
     *| variabel yang memiliki nama yang sama (variable shadowing).
     */

    // ini adalah construktor.
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

    // ini adalah method.
    public void menyapa(){
        System.out.println("Hallo " + name + ", Bagaimana hari anda...?");
    }

}
