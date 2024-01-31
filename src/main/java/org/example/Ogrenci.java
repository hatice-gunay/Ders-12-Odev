package org.example;

public class Ogrenci {
    private final String isim;
    private int yas;

    public Ogrenci(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public void setYas(int yas) throws IllegalArgumentException {
        if (yas < 0 || yas > 100) {
            throw new IllegalArgumentException("Geçersiz yaş. Yaş 0 ile 100 arasında olmalıdır.");
        }
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }
}