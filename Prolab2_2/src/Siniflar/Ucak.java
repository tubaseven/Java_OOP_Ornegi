package Siniflar;

import java.util.ArrayList;
import java.util.Scanner;
import prolab2_2.DosyaIslemleri;

public class Ucak extends HavaTasiti {

    private boolean havadaMi = false;

    public Ucak() {
    }

    public Ucak(String renk, String marka, int uretimYili, int hiz, int tekerlekSayisi, int fiyat) {
        super(renk, marka, uretimYili, hiz, tekerlekSayisi, fiyat);
    }

    @Override
    public void Hizlan() {
        int hiz = getHiz() + 5;
        setHiz(hiz);
    }

    @Override
    public void Yavasla() {
        int hiz = getHiz() - 5;
        setHiz(hiz);
    }

    @Override
    public void Dur() {
        if (havadaMi) {
            System.out.println("Durmak için yerde olmalı.");
        } else {
            setHiz(0);
        }
    }

    @Override
    public void Ekle() {
        Scanner giris = new Scanner(System.in);

        System.out.print("ID           : " + getID());

        System.out.print("Marka        : ");
        setMarka(giris.nextLine());

        System.out.print("Üretim Yılı  : ");
        setUretimYili(Integer.parseInt(giris.nextLine()));

        System.out.print("Renk         : ");
        setRenk(giris.nextLine());

        System.out.print("Hiz          : ");
        setHiz(Integer.parseInt(giris.nextLine()));

        System.out.print("Tekerlek Sayi: ");
        setTekerlekSayisi(Integer.parseInt(giris.nextLine()));

        System.out.print("Fiyat        : ");
        setFiyat(Integer.parseInt(giris.nextLine()));

        // nesnemizi string haline getiriyoruz
        String yazilacakVeri = getID() + "-Arac Tipi: Ucak, " + "Marka: " + getMarka() + ", Uretim Yılı: " + getUretimYili() + ", Renk: " + getRenk() + ", Hiz: " + getHiz() + ", Tekerlek Sayisi: " + getTekerlekSayisi() + ", Fiyat: " + getFiyat();

        try {
            DosyaIslemleri.Arac_Ekle(yazilacakVeri);

            System.out.println("\nUcak Eklendi.");

        } catch (Exception e) {
            System.out.println("\nHATA: Ucak Eklenemedi: " + e.getMessage());
        }
    }

    @Override
    public void Guncelle() {
        Scanner giris = new Scanner(System.in);

        // kullanıcıdan güncellenecek olan aracın ID'si alınıyor:
        System.out.print("Güncellenecek ID: ");
        int guncellenecek_id = Integer.parseInt(giris.nextLine());
        setID(guncellenecek_id);

        System.out.print("Marka        : ");
        setMarka(giris.nextLine());

        System.out.print("Üretim Yılı  : ");
        setUretimYili(Integer.parseInt(giris.nextLine()));

        System.out.print("Renk         : ");
        setRenk(giris.nextLine());

        System.out.print("Hiz          : ");
        setHiz(Integer.parseInt(giris.nextLine()));

        System.out.print("Tekerlek Sayi: ");
        setTekerlekSayisi(Integer.parseInt(giris.nextLine()));

        System.out.print("Fiyat        : ");
        setFiyat(Integer.parseInt(giris.nextLine()));

        // nesnemizi string haline getiriyoruz
        String yazilacakVeri = getID() + "-Arac Tipi: Ucak, " + "Marka: " + getMarka() + ", Uretim Yılı: " + getUretimYili() + ", Renk: " + getRenk() + ", Hiz: " + getHiz() + ", Tekerlek Sayisi: " + getTekerlekSayisi() + ", Fiyat: " + getFiyat();

        try {
            DosyaIslemleri.Arac_Guncelle(guncellenecek_id, yazilacakVeri);

            System.out.println("\nUcak Guncellendi.");

        } catch (Exception e) {
            System.out.println("\nHATA: Ucak Guncellenemedi: " + e.getMessage());
        }
    }

    @Override
    public void Listele() {
        try {

            ArrayList<String> araclar = DosyaIslemleri.Arac_Listele("Ucak");

            for (int i = 0; i < araclar.size(); i++) {
                String arac_verisi = araclar.get(i);
                System.out.println(arac_verisi);
            }
        } catch (Exception e) {
            System.out.println("Listeleme Hatası" + e.getMessage());
        }
    }

}
