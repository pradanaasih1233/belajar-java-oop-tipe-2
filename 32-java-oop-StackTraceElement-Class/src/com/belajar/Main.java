// STACKTRACELEMENT CLASS

/*------------------------------------------------------------
*| STACKELEMENT CLASS
*|------------------------------------------------------------
*| - Throwable memiliki method yang bernama getStackTrace(),
*|   dimana menghasilkan Array dari StackTraceElement object.
*| - StackTraceElement berisikan informasi tentang, class, dan file
*|   terjadinya error.
*| - Class StackTraceElement ini sangat penting untuk ditelusuri.
*| - Cara paling mudah, kita bisa memanggil method printTrace()
*|   class Throwable, untuk memprint ke console detail dari error
*|   StackTraceElement-nya.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 32 stack trace element");

        // deklarasi.
        String[] name = {"jarat", "ahmad", "budi"};

        // error.
        try{
            String nama_tetangga = name[100];
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();

        System.out.println("\n\n\n");

        // cara melihat error yang bertingkat.
        }try{
            contohError();
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }

    // melihat error yang bertingkat.
    public static void contohError(){
        // deklarasi
        String[] name = {"jarat", "ahmad", "budi"};

        try{
            String nama_tetangga = name[100];
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }

}