// RUNTIME EXCEPTION

/*------------------------------------------------------------
*| RUNTIME EXCEPTION
*|------------------------------------------------------------
*| - Excepion yang terjadi karena error saat kode berjalan.
*| - Sistem compiler tidak mendeteksi error ini.
*| - Untuk membuat class runtime exception, wajib extend class
*|   RuntimeException.
*| - contoh runtime exception adalah NullPonterExcption
*|   illegalArgument dll.
*|------------------------------------------------------------
*| TRY CATCH
*|------------------------------------------------------------
*|  Merupakan cara untuk mencoba dan menangkap error dari program.
*| Dalam block ada try, catch dan finally yang selalu dieksekusi.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 30 runtime exception");

        System.out.println("test 1");
        // penggunaan objek validasi.
        LoginRequest loginRequest = new LoginRequest(null, null);

        // penggunaan try catch.
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("request valid");
        } catch (ValidationException e){
            System.out.println("request error : " + e.getMessage());
        }

        System.out.println("test 2");
        // penggunaan objek validasi.
        LoginRequest loginRequest1 = new LoginRequest("jarat", null);

        // penggunaan try catch.
        try {
            ValidationUtil.validate(loginRequest1);
            System.out.println("request valid");
        } catch (ValidationException e){
            System.out.println("request error : " + e.getMessage());
        }

        System.out.println("test 3");
        // penggunaan objek validasi.
        LoginRequest loginRequest2 = new LoginRequest("jarat", "jarat");

        // penggunaan try catch.
        try {
            ValidationUtil.validate(loginRequest2);
            System.out.println("request valid");

            // cara lain buat multi exception.
        } catch (ValidationException e){
            System.out.println("request error : " + e.getMessage());
        }finally {
            System.out.println("akhir test 3");
        }


        // runtime error.

        LoginRequest loginRequest3 = new LoginRequest("jarat","");
        ValidationUtil.validateRuntime(loginRequest3);

    }

}