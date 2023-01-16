package com.belajar;

class Orang {

    // membuat field
    String name;                        // ini field
    String address;                     // ini juga field
    final String country = "indonesia"; // ini juga field

    /*------------------------------------------------------------
     *| METHOD
     *|------------------------------------------------------------
     *|  Method adalah bagian bari program yang akan membuat program
     *| mudah untuk dikelola.
     */

    // ini adalah method
    public void menyapa(){
        System.out.println("Hallo " + name + ", Bagaimana hari anda...?");
    }

}
