// REFLECTION

/*------------------------------------------------------------
*| REFLECTION
*|------------------------------------------------------------
*| - Merupakan kemampuan untuk melihat struktur aplikasi kita
*|   saat aplikasi berjalan.
*| - Sangat berguna untuk membuat libary atau framework.
*/

package com.belajar;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 34 reflection");

        Mobil mobil = new Mobil();

        mobil.setName("supra");
        ValidationUtil.validationReflection(mobil);
    }
}