package day_01;

/*

    OGRENCI YONETIM PLATFORMU KODLAYINIZ.

    1. BU PROGRAMDA OGRENCİ KAYITLARI ILE ILGILI ISLEMLER YAPILABILMELIDIR.
    KAYITLARDA SU BILGILER OLMALIDIR:
        - AD SOYAD
        - KIMLIK NO
        - YAS
        - NUMARA
        - SINIF

    2. ========== ISLEMLER ==========
        1 EKLEME
        2 ARAMA
        3 LISTELEME
        4 SILME
        Q CIKIS

        SECIMINIZ:

        SEKLINDE BIR MENU OLUSTURULMALI.

    3. ARAMA VE SILME ISLEMLERI KIMLIK NO' YA GORE YAPILMALIDIR.
     */

import java.util.ArrayList;
import java.util.List;

public class runner {

    public static void main(String[] args) {


        List<ogrenci> ogrList = new ArrayList();

        ogrenci ogrenci1 = new ogrenci("selman", "guzel", "7777", 31, 183, 1);
        ogrList.add(ogrenci1);

        ogrenci ogrenci2 = new ogrenci("selcuk", "guzelce", "5555", 31, 13, 1);
        ogrList.add(ogrenci2);

        ogrenci ogrenci3 = new ogrenci("serhat", "guzellik", "2222", 31, 1833, 1);
        ogrList.add(ogrenci3);

        islemler islemler = new islemler();
        islemler.menu(ogrList);


    }
}
