package Siniflar;

public abstract class KaraTasiti extends Arac {

    public KaraTasiti() {
    }

    public KaraTasiti(String renk, String marka, int uretimYili, int hiz, int tekerlekSayisi, int fiyat) {
        super(renk, marka, uretimYili, hiz, tekerlekSayisi, fiyat);
    }
}
