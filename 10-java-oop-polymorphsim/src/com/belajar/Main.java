// OBJECT CLASS

// dalam kasus ini adalah kita bisa ketahui bahwa root dari semua class yang kita buat adalah class object.

/*------------------------------------------------------------
 *| OBJECT CLASS
 *|------------------------------------------------------------
 *|  Object class adalah class parent/root dari semua class
 *| yang kita buat.
 */

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 09 object class");

        // membuat object.
        Orang orang = new Orang("yanto","Kulon Progo", true); // construktor akan berjalan disini.

        // VVVVVVVV
        orang.rumah(); // maka ini akan mendapat warisan dari class OrangTua
        orang.Mobil(); // maka ini akan mendapat warisan dari class OrangTua

        // bukti bahwa class kita adalah turunan dari class object.
        System.out.println("-----------------");
        System.out.println(orang.hashCode());
        System.out.println(orang.equals(orang));
        System.out.println(orang.getClass());
        System.out.println(orang.toString());
    }
}