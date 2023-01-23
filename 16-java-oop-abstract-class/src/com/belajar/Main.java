// ABSTRACT

/*------------------------------------------------------------
 *| ABSTRACT
 *|------------------------------------------------------------
 *|  Merupakan class/method yang hanya bisa diturunkan saja.
 *|
 *|  Bila abstract berada di method maka kita wajib untuk
 *| menulis ulang method ini.
 *|
 *|  Dalam abstract tidak bisa gunakan modifier private.
 */

package com.belajar;

import com.belajar.orang.Warga;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 16 abstract class");
        System.out.println("\n");

        // panggil class
        Warga yanto = new Warga();
        yanto.nama = "yanto";
        yanto.alamat = "kulonprogo";

        System.out.println("--------------------------");
        System.out.println("Identitas Warga ");
        System.out.println("--------------------------");
        System.out.println("Nama   : " + yanto.nama);
        System.out.println("Alamat : " + yanto.alamat);
        System.out.println("Negara : " + yanto.negara);
        System.out.println("*dari main class");

        // dari method
        yanto.display();

    }
}