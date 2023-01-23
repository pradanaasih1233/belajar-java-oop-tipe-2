// GETTER SETTER

/*------------------------------------------------------------
*| GETTER SETTER
*|------------------------------------------------------------
*|  GETTER adalah cara untuk dapat mengambil data secara aman.
*|  SETTER adalah cara untuk merubah data secara aman.
*/

/*
* penamaan getter dan setter
* --------------------------------
* tipe data | gettter   | setter
* --------------------------------
* bool      | isXxx()   | setXxx()
* primitif  | getXxx()  | setXxx()
* object    | getXxx()  | setXxx()
* --------------------------------
*/

package com.belajar;

class Warga{
    private String nama;
    private String alamat;
    final String negara = "indonesia";

    public void display(){
        System.out.println("--------------------------");
        System.out.println("Identitas Warga ");
        System.out.println("--------------------------");
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Negara : " + negara);
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNegara() {
        return negara;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 17 getter setter");
        System.out.println("\n");

        // panggil class
        Warga yanto = new Warga();
        yanto.setNama("yanto");
        yanto.setAlamat("Kulonprogo");

        // dari method
        yanto.display();

        System.out.println("\nnama object : " + yanto.getNama());

    }
}