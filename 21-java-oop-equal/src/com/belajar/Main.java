// EQUAL

/*------------------------------------------------------------
*| EQUAL
*|------------------------------------------------------------
*|  Merupakan cara untuk membandingkan object dalam java, hal
*| ini terjadi karena dalam java tidak dapat membandingkan object
*| dangan tanda sama dengan (=).
*|
*|  Untuk perbandingan object maka kita wajib untuk membandingkan
*| dengan meng-override method equal.
*|
*/

package com.belajar;


import java.util.Objects;

class Kucing{
    String nama;
    int massa;

    public void gerak(String gerak) {
        System.out.println("kucing bergerak dengan " + gerak);

    }

    public void suara(String suara) {
        System.out.println("suara kucing adalah " + suara);
    }

    public boolean bernyawa() {
        System.out.println("makhluk hidup ini bernyawa");
        return true;
    }

    public String toString() {
        return "kucing adalah hewan";
    }

    // contoh equal mannual.
    public boolean equals1(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kucing)) return false;

        Kucing kucing = (Kucing) o;
        if(massa != kucing.massa) return false;
        return nama != null ? nama.equals(kucing.nama) : kucing.nama == null;
    }

    // contoh equal dengan generator.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kucing)) return false;
        Kucing kucing = (Kucing) o;
        return massa == kucing.massa &&
                Objects.equals(nama, kucing.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 21 equal");

        Kucing puss = new Kucing();
        puss.nama = "puss";
        puss.massa = 1;
        Kucing puss2 = new Kucing();
        puss2.nama = "puss";
        puss2.massa = 1;

        // bandingkan
        System.out.println(puss.equals1(puss2));
        System.out.println(puss.equals(puss2));

        puss.gerak("kaki");
        puss.suara("meowwwwww");

        // cara panggil
        System.out.println(puss);

    }
}