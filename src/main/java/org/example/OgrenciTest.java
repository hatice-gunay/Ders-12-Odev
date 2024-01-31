package org.example;

public class OgrenciTest {

    public static void main(String[] args) {
        testSetYas();
    }

    public static void testSetYas() {
        Ogrenci ogrenci = new Ogrenci("Ahmet", 20);

        // Senaryo 1: Geçerli bir yaş ataması
        try {
            ogrenci.setYas(25);
            if (ogrenci.getYas() != 25) {
                System.out.println("Hata: Yaş atanamadı.");
            } else {
                System.out.println("Geçerli yaş ataması yapıldı.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        // Senaryo 2: Geçersiz yaş için IllegalArgumentException bekleniyor
        try {
            ogrenci.setYas(-5);
            System.out.println("Hata: IllegalArgumentException bekleniyordu, ancak fırlatılmadı.");
        } catch (IllegalArgumentException e) {
            System.out.println("Beklenen hata: " + e.getMessage());
        }

        try {
            ogrenci.setYas(105);
            System.out.println("Hata: IllegalArgumentException bekleniyordu, ancak fırlatılmadı.");
        } catch (IllegalArgumentException e) {
            System.out.println("Beklenen hata: " + e.getMessage());
        }
    }
}