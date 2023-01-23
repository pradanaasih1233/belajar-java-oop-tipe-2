package com.belajar;

public interface MakhlukHidup {

    boolean bernyawa();

    // maka method ini tidak wajib untuk override.
    default boolean berbulu(){
        System.out.println("tidak berbulu atu tong...");
        return false;
    }
}
