// TRY WITH RESOURCE

/*------------------------------------------------------------
*| TRY WITH RESOURCE
*|------------------------------------------------------------
*| - Ini adalah cara untuk dapat menutup file dengan otomatis
*|   bisa digunakan untuk menutup file dengan otomatis.
*| - Dan hanya untuk class turunan dari class auto closeable
*|   (Wajib menggunakan interface AutoCloseable).
*| - Ini hanya berlaku pada Try.
*| - Terdapat sejak java 7.
*/

package com.belajar;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 33 try with resoutce");

        try(FileInputStream data_file = new FileInputStream("data.txt")){
            System.out.println("mencoba membuka file");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("maka file akan otomatis close");
        }
    }

}