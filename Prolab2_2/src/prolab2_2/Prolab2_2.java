package prolab2_2;

import Siniflar.Bisiklet;
import Siniflar.Gemi;
import Siniflar.Otomobil;
import Siniflar.Ucak;
import Siniflar.UcanGemi;
import java.util.Scanner;

public class Prolab2_2 {

    public static void main(String[] args) throws Exception {

        // sonsuz döngü:
        while (true) {

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:");
            System.out.println("1: Veri Girişinde Bulun");
            System.out.println("2: Veri Listele");
            System.out.println("3: Veri Güncelle");
            System.out.println();
            System.out.println("0: Çıkış");

            Scanner giris = new Scanner(System.in);
            int islem = Integer.parseInt(giris.nextLine());
            switch (islem) {
                case 0:
                    UygulamayiSonlandir();
                    break;

                case 1:
                    AracSecimiEkle();
                    break;

                case 2:
                    AracSecimiGuncelle();
                    break;

                case 3:
                    AracSecimiListele();
                    break;
            }

        }// sonsuz döngü sonu:

    }

    public static void UygulamayiSonlandir() {
        System.exit(0);
    }

    public static void AracSecimiEkle() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Veri girişinde bulunacağınız aracı seçiniz:");
        System.out.println("1. Otomobil");
        System.out.println("2. Bisiklet");
        System.out.println("3. Gemi");
        System.out.println("4. Uçak");
        System.out.println("5. Uçan Gemi");
        System.out.println();
        System.out.println("9: Bir önceki menüye geri dön");
        System.out.println("0: Çıkış");

        Scanner giris = new Scanner(System.in);
        int islem = Integer.parseInt(giris.nextLine());
        switch (islem) {
            case 0:
                UygulamayiSonlandir();

            case 9:
                return;

            case 1:
                Otomobil oto = new Otomobil();
                oto.Ekle();
                break;

            case 2:
                Bisiklet bisiklet = new Bisiklet();
                bisiklet.Ekle();
                break;

            case 3:
                Gemi gemi = new Gemi();
                gemi.Ekle();
                break;

            case 4:
                Ucak ucak = new Ucak();
                ucak.Ekle();
                break;

            case 5:
                UcanGemi ugemi = new UcanGemi();
                ugemi.Ekle();
                break;
        }
    }

    public static void AracSecimiGuncelle() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Veri güncelleyeceğiniz aracı seçiniz:");
        System.out.println("1. Otomobil");
        System.out.println("2. Bisiklet");
        System.out.println("3. Gemi");
        System.out.println("4. Uçak");
        System.out.println("5. Uçan Gemi");
        System.out.println();
        System.out.println("9: Bir önceki menüye geri dön");
        System.out.println("0: Çıkış");

        Scanner giris = new Scanner(System.in);
        int islem = Integer.parseInt(giris.nextLine());
        switch (islem) {
            case 0:
                UygulamayiSonlandir();

            case 9:
                return;

            case 1:
                Otomobil oto = new Otomobil();
                oto.Guncelle();
                break;

            case 2:
                Bisiklet bisiklet = new Bisiklet();
                bisiklet.Guncelle();
                break;

            case 3:
                Gemi gemi = new Gemi();
                gemi.Guncelle();
                break;

            case 4:
                Ucak ucak = new Ucak();
                ucak.Guncelle();
                break;

            case 5:
                UcanGemi ugemi = new UcanGemi();
                ugemi.Guncelle();
                break;
        }
    }

    public static void AracSecimiListele() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Veri listeleyeceğiniz aracı seçiniz:");
        System.out.println("1. Otomobil");
        System.out.println("2. Bisiklet");
        System.out.println("3. Gemi");
        System.out.println("4. Uçak");
        System.out.println("5. Uçan Gemi");
        System.out.println();
        System.out.println("9: Bir önceki menüye geri dön");
        System.out.println("0: Çıkış");

        Scanner giris = new Scanner(System.in);
        int islem = Integer.parseInt(giris.nextLine());
        switch (islem) {
            case 0:
                UygulamayiSonlandir();

            case 9:
                return;

            case 1:
                Otomobil oto = new Otomobil();
                oto.Guncelle();
                break;

            case 2:
                Bisiklet bisiklet = new Bisiklet();
                bisiklet.Guncelle();
                break;

            case 3:
                Gemi gemi = new Gemi();
                gemi.Guncelle();
                break;

            case 4:
                Ucak ucak = new Ucak();
                ucak.Guncelle();
                break;

            case 5:
                UcanGemi ugemi = new UcanGemi();
                ugemi.Guncelle();
                break;
        }
    }

}
