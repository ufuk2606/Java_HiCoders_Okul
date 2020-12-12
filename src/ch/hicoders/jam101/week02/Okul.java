package ch.hicoders.jam101.week02;

import ch.hicoders.jam101.week02.kisi.Ogrenci;

import java.util.ArrayList;
import java.util.Random;

public class Okul {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfStudents = random.nextInt(50);
        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> matemetikdenKalanlar = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> almancadanKalanlar = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> matemetikdenGecenler = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> almancadanGecenler = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> almancadanEnYuksekNotAlanlar = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> almancadanEnDusukNotAlanlar = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> matematiktenEnYuksekNotAlanlar = new ArrayList<Ogrenci>();
        ArrayList<Ogrenci> matematiktenEnDusukNotAlanlar = new ArrayList<Ogrenci>();
        float totalAlmanca = 0;
        float totalMatematik = 0;
        float almancaOrtalama = 0;
        float matematikOrtalama = 0;
        float matematikenYüksekNot = 0;
        float almancaenYüksekNot = 0;
        float matematikenDüsükNot = 6;
        float almancaenDüsükNot = 6;
        for(int i = 1; i <= numberOfStudents; i++){
            int mathScore = random.nextInt(6);
            int germanScore = random.nextInt(6);
            Ogrenci liste = new Ogrenci(i, mathScore ,germanScore);
            ogrenciler.add(liste);
            System.out.println( liste.ogrenciIsmi + " nolu ogrencinin " + " matematik notu " + liste.matematikNotu
                    + "'dir. Almanca notu ise "+ liste.almancaNotu + "'dir.");
            totalAlmanca = totalAlmanca + liste.almancaNotu;
            totalMatematik = totalMatematik + liste.matematikNotu;
            almancaOrtalama =  totalAlmanca / ogrenciler.size();
            matematikOrtalama = totalMatematik / ogrenciler.size();

            if(liste.almancaNotu < almancaOrtalama){
                almancadanKalanlar.add(liste);
            }else {
                almancadanGecenler.add(liste);
            }
            if(liste.matematikNotu < matematikOrtalama){
                matemetikdenKalanlar.add(liste);
            }else {
                matemetikdenGecenler.add(liste);
            }
            if(liste.matematikNotu > matematikenYüksekNot){
                matematikenYüksekNot = liste.matematikNotu;
                matematiktenEnYuksekNotAlanlar.add(liste);
            }
            if(liste.matematikNotu < matematikenDüsükNot){
                matematikenDüsükNot = liste.matematikNotu;
                matematiktenEnDusukNotAlanlar.add(liste);
            }
            if(liste.almancaNotu > almancaenYüksekNot){
                almancaenYüksekNot = liste.almancaNotu;
                almancadanEnYuksekNotAlanlar.add(liste);
            }
            if(liste.almancaNotu < almancaenDüsükNot){
                almancaenDüsükNot = liste.almancaNotu;
                almancadanEnDusukNotAlanlar.add(liste);
            }
        }
        System.out.println("Sinifin Almanca ortalamasi  " + almancaOrtalama);
        System.out.println("Sinifin Matematik ortalamasi  " + matematikOrtalama);
        for (Ogrenci almancaKalanlar: almancadanKalanlar){
            System.out.println(almancaKalanlar.ogrenciIsmi +" numarali ogrenci Almanca dersinden kalmistir.");
        }
        for (Ogrenci matematikKalanlar: matemetikdenKalanlar){
            System.out.println(matematikKalanlar.ogrenciIsmi +" numarali ogrenci Matematik dersinden kalmistir.");
        }
        for (Ogrenci matematiktenEnyuksekNotuAlanlar: matematiktenEnYuksekNotAlanlar){
            System.out.println(matematiktenEnyuksekNotuAlanlar.ogrenciIsmi +" numarali ogrenci " +
                    matematiktenEnyuksekNotuAlanlar.matematikNotu + " notu ile matematikten en yuksek notu almistir");
        }
        for (Ogrenci matematiktenEndusukNotuAlanlar: matematiktenEnDusukNotAlanlar){
            System.out.println(matematiktenEndusukNotuAlanlar.ogrenciIsmi +" numarali ogrenci " +
                    matematiktenEndusukNotuAlanlar.matematikNotu + " notu ile matematikten en dusuk notu almistir");
        }
        for (Ogrenci almancadanEnyuksekNotuAlanlar: almancadanEnYuksekNotAlanlar){
            System.out.println(almancadanEnyuksekNotuAlanlar.ogrenciIsmi +" numarali ogrenci " +
                    almancadanEnyuksekNotuAlanlar.matematikNotu + " notu ile almancadan en yuksek notu almistir");
        }
        for (Ogrenci almancadanEndusukNotuAlanlar: almancadanEnDusukNotAlanlar){
            System.out.println(almancadanEndusukNotuAlanlar.ogrenciIsmi +" numarali ogrenci " +
                    almancadanEndusukNotuAlanlar.matematikNotu + " notu ile almancadan en dusuk notu almistir");
        }
    }
}
