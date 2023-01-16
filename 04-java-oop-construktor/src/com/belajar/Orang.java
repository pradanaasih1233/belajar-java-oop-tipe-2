package com.belajar;

class Orang {

    // membuat field.
    String name;                        // ini field
    String address;                     // ini juga field
    final String country = "indonesia"; // ini juga field

    /*------------------------------------------------------------
     *| CONSTRUKTOR
     *|------------------------------------------------------------
     *|  Construktor adalah method dari sebuah class yang akan selalu
     *| dipanggil saat objek dibuat dari class.
     */

    // ini adalah construktor.
    public Orang(){
        System.out.println("ini adalah construktor yang akan dipanggil...");
    }

    // ini adalah construktor overload yang akan dipanggil sesuai parameter.
    public Orang(String name, String address, boolean tampilkan){

        // mengisi data
        this.name = name;
        this.address = name;

        if (tampilkan) {
            System.out.println("ini adalah construktor yang akan dipanggil...");
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
