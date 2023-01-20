// TYPE CHECK DAN CASTS

// Dalam hal ini adalah membandingkan tipe data dari objek.

/*------------------------------------------------------------
 *| TYPE CHECK DAN CASTS
 *|------------------------------------------------------------
 *|  type check adalah cara untuk chek tipe data sebelum
 *| melakukan casts/kasting tipe data. Digunakan kata
 *| kunci instanceof yang meghasilkan boolean.
 */

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 09 object class");

        // contoh :
        // ini adalah cara merubah bentuk.
        Kakek kakek = new Kakek("saya jarat");
        siapaSaya(kakek);

        // objek kakek berubah.
        kakek = new OrangTua();
        siapaSaya(kakek);

        // objek kakek berubah.
        kakek = new Orang("jarat","kulonprogo",true);
        siapaSaya(kakek);


    }

    public static void siapaSaya(Kakek kakek){

        System.out.println("---------------------------");

        // ini adalah check type.
        if (kakek instanceof OrangTua){

            // ini adalah konversi type;
            OrangTua orangTua = (OrangTua) kakek;
            orangTua.sayaAdalah();

            // ini adalah check type.
        } else if (kakek instanceof Orang){

            // ini adalah konversi type;
            Orang orang = (Orang) kakek;
            orang.sayaAdalah();

        } else {
            kakek.sayaAdalah();
        }

        System.out.println("---------------------------");
    }

}