package com.belajar;

public class Hewan {

    // static field.
    public static final String JENIS = "makhluk hidup";

    // static method.
    public static boolean bernafas(){
        System.out.println("makhluk hidup pasti bernafas");
        return true;
    }

    // static block.
    static {
        System.out.println("ini adalah static block\n" +
                "akan dijalankan pada saat objek di-load");

        // static block hanya akan bisa akses variable static juga.

    }

    // static inner class.
    public static class kucing{

        public static String JENIS = "kucing";

        public void bergerak(){
            System.out.println("kucing bergerak dengan berjalan/berlari");
        }
    }
}
