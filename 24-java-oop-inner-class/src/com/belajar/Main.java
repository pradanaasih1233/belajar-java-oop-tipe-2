// INNER CLASS

/*------------------------------------------------------------
*| INNER CLASS
*|------------------------------------------------------------
*| Inner class adalah cara membuat class di dalam class.
*| Dari inner class kita dapat menarik nama parent tanpa
*| repot-repot getter setter.
*/

package com.belajar;

class Presiden{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public class Mentri{
        private String nama;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNamaPresiden(){
            return Presiden.this.nama;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 24 inner class");

        // cara aksess inner class.
        Presiden presiden = new Presiden(); // harus ada class pelantara
        presiden.setNama("bapak saya");

        Presiden.Mentri mentri = presiden.new Mentri();
        mentri.setNama("pakde saya");

        System.out.println("presiden saya adalah " + mentri.getNamaPresiden());
    }
}