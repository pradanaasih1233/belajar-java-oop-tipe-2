// ANNOTATION

/*------------------------------------------------------------
*| ANNOTATION
*|------------------------------------------------------------
*| - Merupakan cara untuk menambahkan informasi tambahan ke dalam
*|   kode program.
*| - Annotaion dapat diakses dengan Reflection.
*| - Biasanya menggunakan @interface dalam implemtasinya.
*| - Annotation untuk menambah metadata.
*
* ===========================================================================
*       attribute              keterangan
* ===========================================================================
*
*     @Target               menandakan annotation bisa digunakan dimana?
*                           class, method, field dll.
*
*     @Retention            memberitahu apakan annotation disimpan dihasil
*                           kompilasi dan apakah bisa dibaca oleh refection?
*/

package com.belajar;

@Fancy(name = "orang")
class Orang{

}

@Fancy(name = "Kendaraan", tags = {"java","app"})
class Kendaraan{

}
public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 34 annotation");
    }
}