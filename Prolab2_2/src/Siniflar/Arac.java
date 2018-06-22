package Siniflar;

import java.io.InputStream;
import java.util.Scanner;
import prolab2_2.DosyaIslemleri;

public abstract class Arac {

    private String renk;
    private String marka;
    private int uretimYili;
    private int hiz;
    private int tekerlekSayisi;
    private int fiyat;
    private int ID;

    private static int static_ID = 1;

    public Arac() {
    }

    public Arac(String renk, String marka, int uretimYili, int hiz, int tekerlekSayisi, int fiyat) {
        this.renk = renk;
        this.marka = marka;
        this.uretimYili = uretimYili;
        this.hiz = hiz;
        this.tekerlekSayisi = tekerlekSayisi;
        this.fiyat = fiyat;

        ID = static_ID;
        static_ID++;
    }

    public abstract void Hizlan();

    public abstract void Yavasla();

    public abstract void Dur();

    public abstract void Ekle();

    public abstract void Guncelle();

    public abstract void Listele();

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the uretimYili
     */
    public int getUretimYili() {
        return uretimYili;
    }

    /**
     * @param uretimYili the uretimYili to set
     */
    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    /**
     * @return the hiz
     */
    public int getHiz() {
        return hiz;
    }

    /**
     * @param hiz the hiz to set
     */
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    /**
     * @return the tekerlekSayisi
     */
    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    /**
     * @param tekerlekSayisi the tekerlekSayisi to set
     */
    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    /**
     * @return the fiyat
     */
    public int getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }
}
