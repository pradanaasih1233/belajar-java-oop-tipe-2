// ini adalah interface.
package com.belajar;

public interface Hewan extends MakhlukHidup{

    // secara default method ini adalah abstract.
    void gerak(String gerak);
    void suara(String suara);
}
