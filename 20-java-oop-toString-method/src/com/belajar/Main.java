// TOSTRING

/*------------------------------------------------------------
*| TOSTRING
*|------------------------------------------------------------
*|  Merupakan cara untuk dapat mengubah data output bila kita
*| akan menampilkan data object. Secara default adalah
*|       namaclass + @ + hashCode
*|
*/

package com.belajar;


class Kucing{

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

    // ini adalah contoh penerapannya.
    public String toString() {
        return "kucing adalah hewan";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 20 tostring");

        Kucing puss = new Kucing();

        puss.gerak("kaki");
        puss.suara("meowwwwww");

        // cara panggil
        System.out.println(puss);

    }
}