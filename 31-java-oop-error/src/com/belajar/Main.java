// ERROR

/*------------------------------------------------------------
*| ERROR
*|------------------------------------------------------------
*| - Error adalah cara lain untuk error fatal yang mengharuskan
*|   menghentikan aplikasi secara keseluruhan.
*| - Misal kita akan menghubungkan database dan terjadi error.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 31 error");

        // menaggil method error.
        connectDatabase(null,null);

    }

    public static void connectDatabase(String username, String password){

        // ini misal penggunaan error dalam method.
        if (username == null || password == null){
            throw new VerifikasiDatabase("error database, aplikasi berhenti");
        }
    }
}