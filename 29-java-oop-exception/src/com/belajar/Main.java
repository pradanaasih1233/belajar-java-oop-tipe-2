// EXCEPTION

/*------------------------------------------------------------
*| EXCEPTION
*|------------------------------------------------------------
*| - Excepion berfungsi untuk menangani error pada bagian
*|   program, agar program tetap berjalan.
*| - Jika kita ingin membuat exception, kita harus membuat class
*|   yang mengextend class Throwable atau turunan-turunannya.
*|------------------------------------------------------------
*| MEMBUAT EXCEPTION
*|------------------------------------------------------------
*| - Exception biasanya terjadi di method, dan bila di method maka
*|   method harus ditandai dengan throw diikuti class exceptionnya.
*| - Jika exception dapat menimbulkan lebih banyak jenis exception
*|   kita bisa menambahkan jenis exception itu juga.
*| - Di dalam kode program kita, untuk membuat exception kita cukup
*|   menggunakan kata kunci throw, diikuti dengan object exception.
*|------------------------------------------------------------
*| TRY CATCH
*|------------------------------------------------------------
*|  Merupakan cara untuk mencoba dan menagkap error dari program.
*| Dalam block ada try, catch dan finally yang selalu dieksekusi.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 29 exception");

        System.out.println("test 1");
        // penggunaan objek validasi.
        LoginRequest loginRequest = new LoginRequest(null, null);

        // penggunaan try catch.
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("request valid");
        } catch (ValidationException e){
            System.out.println("request error : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("request error : " + e.getMessage());

        // finally akan selalu dijalankan.
        } finally {
            System.out.println("akhir test 1");
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
        }catch (NullPointerException e) {
            System.out.println("request error : " + e.getMessage());
        }finally {
            System.out.println("akhir test 2");
        }

        System.out.println("test 3");
        // penggunaan objek validasi.
        LoginRequest loginRequest2 = new LoginRequest("jarat", "jarat");

        // penggunaan try catch.
        try {
            ValidationUtil.validate(loginRequest2);
            System.out.println("request valid");

        // cara lain buat multi exception.
        } catch (ValidationException | NullPointerException e){
            System.out.println("request error : " + e.getMessage());
        }finally {
            System.out.println("akhir test 3");
        }
    }
}