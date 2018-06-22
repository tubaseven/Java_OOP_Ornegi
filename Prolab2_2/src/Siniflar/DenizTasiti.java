package Siniflar;

public abstract class DenizTasiti extends Arac {

    public DenizTasiti() {
    }

    public DenizTasiti(String renk, String marka, int uretimYili, int hiz, int tekerlekSayisi, int fiyat) {
        super(renk, marka, uretimYili, hiz, tekerlekSayisi, fiyat);
    }

}
