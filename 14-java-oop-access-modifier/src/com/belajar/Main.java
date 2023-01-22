// PACKAGE

// Dalam hal ini adalah sebuah fitur untuk megelola file dalam java.

/*------------------------------------------------------------
 *| PACAKE
 *|------------------------------------------------------------
 *|  Dalam java terdapat sebuah cara untuk mengelola class/file
 *| dengan memisahkan suatu file java satu dengan file java yang
 *| lain. untuk mengkases suatu file maka harus dideklarasikan
 *| alamat file tersebut dengan kata kunci import diikuti
 *| path file dengan tanda titik(.).
 */

package com.belajar;

import com.belajar.kakek.Kakek;
import com.belajar.orang.Orang;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 13 package");

        Orang orang = new Orang("jarat","kulonprogo",true);
        orang.sayaAdalah();

        Kakek kakek = orang;
        kakek.sayaAdalah();
    }
}