
package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 02 fields");

        // membuat object
        Orang orang = new Orang();

        /*------------------------------------------------------------
         *| CARA MEMANIPULASI FIELD
         *|------------------------------------------------------------
         *|  Fields yang ada di object dapat dimanipulasi. Kecuali tipe final.
         *| Untuk mengakses field, gunakan tanda titik(.) setelah nama object
         *| yang diikuti nama field-nya.
         */

        // caranya merubah nilai field
        orang.name = "yanto";
        orang.address = "kulon progo";
        // orang.country = "jepang"; <-- tidak dapat dirubah karena final.

        // cara akses field
        System.out.println("Nama   : " + orang.name);
        System.out.println("Alamat : " + orang.address);
        System.out.println("Negara : " + orang.country);
    }
}