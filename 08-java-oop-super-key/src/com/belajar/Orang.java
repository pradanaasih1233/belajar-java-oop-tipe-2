package com.belajar;

/*------------------------------------------------------------
 *| SUPER KEY
 *|------------------------------------------------------------
 *|  Super key adalah cara untuk mengakses construktor/method/field
 *| pada class yang mewariskan.
 */

class Orang extends OrangTua {

    // membuat field.
    String name;                        // ini field
    String address;                     // ini juga field
    final String country = "indonesia"; // ini juga field

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


    // ini adalah cara untuk menggunakan super key.
    public void Mobil() {

        // pengunaan pada field.
        System.out.println("akses dari class atas... " + super.mobil);

        // penggunaan pada method.
        super.Mobil();
    }

    public void rumah() {

        // penggunaan pada field.
        System.out.println("akses dari class atas... " + super.rumah);

        // penggunaan pada method.
        super.rumah();
    }
}
