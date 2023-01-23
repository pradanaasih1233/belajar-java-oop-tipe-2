// INTERFACE LEBIH DALAM

/*------------------------------------------------------------
*| INTERFACE YANG DIWARISKAN
*|------------------------------------------------------------
*|  Merupakan sebuah calss yang dapat dikontrak oleh class
*| turunaannya. Apa pun yang ada di method interface harus
*| ditulis ulang. Hal ini adalah cara untuk mewariskan dari
*| interface lain.
*|
*|  Dalam interface juga terdapat atribut default dalam method
*| yang membuat tidak wajib untuk menulis ulang method tersebut.
*|
*/

package com.belajar;


class Kucing implements Hewan{

    // penulisan ulang dari interface Hewan
    public void gerak(String gerak) {
        System.out.println("kucing bergerak dengan " + gerak);

    }

    // penulisan ulang dari interface Hewan
    public void suara(String suara) {
        System.out.println("suara kucing adalah " + suara);
    }

    // penulisan ulang dari interface Makhluk hidup
    public boolean bernyawa() {
        System.out.println("makhluk hidup ini bernyawa");
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 19 interface lebih dalam");

        Kucing puss = new Kucing();

        puss.gerak("kaki");
        puss.suara("meowwwwww");

    }
}