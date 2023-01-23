// IMPORT

// Dalam hal ini adalah suatu cara untuk dapat mengakases suatu libary/class
// dari luar file ini.

/*------------------------------------------------------------
 *| IMPORT
 *|------------------------------------------------------------
 *|  Cara untuk memasukkan class lain agar dapat diakses
 *| dari dalam class ini. Class yang dapat di akases adalah
 *| class public.
 *|
 *| ***default import dalam java adalah :
 *|    String, Integer, Boolean, long dll.
 *|    jadi kita tidak perlu untuk import class tersebut.
 */

package com.belajar;

// ini adalah contoh penggunaan import dalam java.
import com.belajar.orang.Orang;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 15 import");

        Orang orang = new Orang("jarat","kulonprogo",true);
        orang.sayaAdalah();
    }
}