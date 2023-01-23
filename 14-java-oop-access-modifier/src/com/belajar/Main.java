// ACCESS MODIFIER

// Dalam hal ini adalah suatu cara untuk memberikan izin dari field/method.

/*------------------------------------------------------------
 *| ACCESS MODIFIER
 *|------------------------------------------------------------
 *|  Cara untuk memberikan izin dari field/method agar
 *| dapat diakses/tidak.
 */

/*| Modifier    | class | package   | Subclass  | world
 *-----------------------------------------------------
 *| public      | y     | y         | y         | y
 *| protected   | y     | y         | n         | n
 *| no modifire | y     | y         | n         | n
 *| private     | y     | n         | n         | n
 *
 *     **no modifier : default : tanpa tanda apa pun.
 *     **dalam 1 file java hanya ada 1 class public saja.
 *     **nama public class harus sama dengan nama file.
 */

package com.belajar;

import com.belajar.kakek.Kakek;
import com.belajar.orang.Orang;

// ini menandakan bahwa class ini umum.
public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 14 access modifier");

        Orang orang = new Orang("jarat","kulonprogo",true);
        orang.sayaAdalah();

        Kakek kakek = orang;
        kakek.sayaAdalah();
    }
}
