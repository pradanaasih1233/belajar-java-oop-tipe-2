// STATIC KEY

/*------------------------------------------------------------
*| STATIC KEY
*|------------------------------------------------------------
*|  Merupakan modifier yang mambuat innerclass/method/field dapat
*| diakses tanpa harus membuat objek dari class itu terlebih
*| dahulu.
*|------------------------------------------------------------
*| STATIC DAPAT DIGUNAKAN PADA :
*|------------------------------------------------------------
*| - Field atau class variable.
*| - Method atau class method.
*| - Block atau static block akan dijalankan otomatis ketika
*|   class di-load.
*| - Innerclass yang menyababkan kita tidak bisa akses lagi
*|   object outer classnya.
*/

package com.belajar;

// ini akan membuat kita dapat lebih pendek dalam memanggil
// field, tanpa nama class.
import static com.belajar.Hewan.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 26 static");

        // cara aksess static
        System.out.println(Hewan.JENIS);
        Hewan.bernafas();

        // tanpa object hewan
        Hewan.kucing kucing = new Hewan.kucing();
        kucing.bergerak();

        // ini terjadi karena ada import static.
        System.out.println(JENIS);


    }
}