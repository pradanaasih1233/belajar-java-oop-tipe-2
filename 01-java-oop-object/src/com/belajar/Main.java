/*------------------------------------------------------------
 *| APA ITU OBJECT
 *|------------------------------------------------------------
 *|  Object adalah data yang berisi field / properties / attributes
 *| dan method / funtion / behavior.
 *|
 *|  Semua data bukan primitif di java adalah object, dari mulai
 *| integer, boolean, character, string, dan yang lainnya.
 */

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("BELAJAR JAVA OOP 01 OBJECT");

        /*------------------------------------------------------------
         *| MEMBUAT OBJECT
         *|------------------------------------------------------------
         *|  Object adalah hasil instansiasi dari sebuah class. Untuk
         *| membuat object kita bisa menggunakan kata kunci new, dan
         *| diikuti dengan nama class dan kurung().
         */

        // membuat object
        Orang orang = new Orang();
        Orang orang1 = new Orang();
        Orang orang2 = new Orang();
    }
}