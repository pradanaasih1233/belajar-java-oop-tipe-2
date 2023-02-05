package com.belajar;

public class Mobil {

    @NotBlank
    private String name;
    @NotBlank
    private String merek;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
}
