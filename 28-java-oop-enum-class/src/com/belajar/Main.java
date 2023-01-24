// ENUM CLASS

/*------------------------------------------------------------
*| ENUM CLASS :
*|------------------------------------------------------------
*| - Class yang berisikan nilai terbatas yang kita tentukan sendiri.
*| - Secara otomatis class ini mengextend class java.lang.Enum.
*|   Tapi masih dapat implements interface.
*| - Dalam enum kita dapat membuat field, method dan contruktor.
*| - Construktor dalam enum tidak dapat public, karena tujuan dari
*|   enum bukan untuk instansiasi secara bebas.
*/

package com.belajar;

import java.util.Arrays;

class User{
    String nama;
    Level level;
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA OOP 28 enum class");

        User user = new User();
        user.nama = "wanti";
        user.level = Level.PREMIUM;

        System.out.println(user.nama);
        System.out.println(user.level);

        // cara aksess nilai enum.
        String levelStr = Level.PREMIUM.name();
        System.out.println(levelStr);

        // konversi enum menjadi string.
        Level level = Level.valueOf("VIP");
        System.out.println(level);

        // mengambil array dari nilai enum.
        Level[] arrayLevel = Level.values();
        System.out.println(Arrays.toString(arrayLevel));
    }
}