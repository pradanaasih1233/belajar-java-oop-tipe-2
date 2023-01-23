// HASHCODE

/*------------------------------------------------------------
*| HASHCODE
*|------------------------------------------------------------
*|  Method hashcode adalah representasi dari integer object.
*| hashcode megembalikan nilai integer sesuai data di memory
*| dan kita wajib meng-override jika kita inginkan.
*|
*|------------------------------------------------------------
*| KONTRAK HASHCODE METHOD
*|------------------------------------------------------------
*| Tidak mudah dalam mengoverride hashcode karena ada kontrak
*| yang harus dipenuhi :
*|  - Sebanyak apapun hashcode dipanggil harus menghasilkan
*|    data integer yang sama.
*|  - Jika ada 2 object yang sama jika dibandingkan dengan
*|    method equal, maka nilai hashcode juga harus sama.
*|  - Tidak wajib hashcode berada jika method equals menghasilkan
*|    false, karena menghasilkan keterbatasan jumlah sekitar 2
*|    milyar.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kucing)) return false;
        Kucing kucing = (Kucing) o;
        return massa == kucing.massa &&
                Objects.equals(nama, kucing.nama);
    }

    // ini adalah hashcode
    // -------------------
    @Override
    public int hashCode() {

        return Objects.hash(nama, massa);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 22 hashcode");

        Kucing puss = new Kucing();
        puss.nama = "puss";
        puss.massa = 1;
        Kucing puss2 = new Kucing();
        puss2.nama = "puss";
        puss2.massa = 1;

        // bandingkan
        System.out.println("perbandingan dengan equal");
        System.out.println(puss.equals(puss2));
        System.out.println("perbandingan dengan hashcode");
        System.out.println(puss.hashCode() == puss2.hashCode());

        puss.gerak("kaki");
        puss.suara("meowwwwww");

        // cara panggil
        System.out.println(puss);

    }
}