package com.belajar;

// contoh penggunaan enum.

public enum Level {
    STANDARD("level standard"),
    PREMIUM("level premium"),
    VIP("level vip");

    // ini adalah field.
    private String deskripsi;

    // ini adalah construktor.
    Level(String deskripsi){
        this.deskripsi = deskripsi;
    }

    // ini adalah getter.
    public String getDeskripsi() {
        return deskripsi;
    }
}
