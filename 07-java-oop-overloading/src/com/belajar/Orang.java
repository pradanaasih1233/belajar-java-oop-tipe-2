package com.belajar;

/*------------------------------------------------------------
 *| OVERLOADING
 *|------------------------------------------------------------
 *|  Overloading adalah cara untuk megatasi variasi dari method
 *| yang bermacam-macam.
 */

class Orang{

    // membuat field.
    String name;                        // ini field
    String address;                     // ini juga field
    final String country = "indonesia"; // ini juga field

    // ini adalah construktor.
    public Orang(String name, String address, boolean tampilkan){
        System.out.println("ini adalah construktor yang akan dipanggil...");

        // ini adalah contoh penggunaan this key.
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
        System.out.println("Hallo, Bagaimana hari anda...?");
    }

    // ini adalah method overloading.
    public void menyapa(String name){
        System.out.println("Hallo " + this.name + ", Bagaimana hari anda...? Saya adalah " + name);
    }

}
