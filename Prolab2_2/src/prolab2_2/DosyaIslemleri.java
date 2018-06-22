package prolab2_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class DosyaIslemleri {

    public static void Arac_Ekle(String arac_verisi) throws Exception {
        ArrayList<String> satirlar = new ArrayList<String>();

        satirlar.add(arac_verisi);

        File file = new File("C:/ProlabTXT/araclar.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String satir;
        while ((satir = br.readLine()) != null) {
            satirlar.add(satir);
        }
        br.close();
        fis.close();

        File file2 = new File("C:/ProlabTXT/araclar.txt");
        FileOutputStream fos = new FileOutputStream(file2);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < satirlar.size(); i++) {
            String yazilacak = satirlar.get(i);

            bw.write(yazilacak);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        fos.close();
    }

    public static void Arac_Guncelle(int arac_ID, String arac_verisi) throws Exception {
        String id = String.valueOf(arac_ID);

        ArrayList<String> satirlar = new ArrayList<String>();

        File file = new File("C:/ProlabTXT/araclar.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String satir;
        while ((satir = br.readLine()) != null) {
            int bulunan_yer = satir.indexOf(id);
            if (bulunan_yer == 1) {
                // aranan araç bu, güncel araç bilgisi listeye ekleniyor
                satirlar.add(arac_verisi);
            } else {
                // aranan araç değil, listeye ekle
                satirlar.add(satir);
            }
        }
        br.close();
        fis.close();

        // listeyi temizlenen dosyaya yaz:
        File file2 = new File("C:/ProlabTXT/araclar.txt");
        FileOutputStream fos = new FileOutputStream(file2);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < satirlar.size(); i++) {
            String yazilacak = satirlar.get(i);

            bw.write(yazilacak);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        fos.close();
    }

    public static ArrayList<String> Arac_Listele(String arac_tipi) throws Exception {
        ArrayList<String> satirlar = new ArrayList<String>();

        File file = new File("C:/ProlabTXT/araclar.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String satir;
        while ((satir = br.readLine()) != null) {
            // sadece aranan araç tipine ait olan araçlar listeye ekleniyor
            int bulunan_yer = satir.indexOf(arac_tipi);
            if (bulunan_yer != -1) {
                satirlar.add(satir);
            }
        }
        br.close();
        fis.close();

        return satirlar;
    }
}
