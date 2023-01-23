// INTERFACE

/*------------------------------------------------------------
*| INTERFACE
*|------------------------------------------------------------
*|  Merupakan sebuah calss yang dapat dikontrak oleh class
*| turunaannya. Apa pun yang ada di method interface harus
*| ditulis ulang.
*/

package com.belajar;


class Kucing implements Hewan{

    public void gerak(String gerak) {
        System.out.println("kucing bergerak dengan " + gerak);

    }

    public void suara(String suara) {
        System.out.println("suara kucing adalah " + suara);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 18 interface");

        Kucing puss = new Kucing();

        puss.gerak("kaki");
        puss.suara("meowwwwww");


    }
}