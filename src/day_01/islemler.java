package day_01;

import java.util.List;
import java.util.Scanner;

public class islemler {
    Scanner scan = new Scanner(System.in);
    ogrenci ogrenci;
    int numara = 1000;
    void menu(List<ogrenci> ogrList){
        System.out.print("========== ISLEMLER ==========\n" +
                "        1 EKLEME\n" +
                "        2 LISTELEME\n" +
                "        3 ARAMA\n" +
                "        4 SILME\n" +
                "        Q CIKIS\n" +
                "\n" +
                "        SECIMINIZ:");

        char secim = scan.next().toUpperCase().charAt(0);

        switch (secim){
            case '1':{
                ekleme(ogrList);
            }
            case '2':{
                listele(ogrList);
            }
            case '3':{
                arama(ogrList);
            }
            case '4':{
                silme(ogrList);
            }
            case 'Q':{
                System.exit(0);
            }
            default: {
                System.out.println("YANLIS DEGER GIRDINIZ!!!");
                menu(ogrList);
            }
        }
    }

    private void silme(List<ogrenci> ogrList) {
        int flag = 0;
        System.out.println("Silinecek Ogrencinin TCNO' sunu Giriniz: ");
        String silinecekTcNo = scan.next();
        for (int i = 0; i <ogrList.size() ; i++) {
            if (silinecekTcNo.equals(ogrList.get(i).getTcNo())){
                ogrList.remove(i);
                flag = 1;
                listele(ogrList);
            }
        }
        if (flag == 0){
            System.out.println("Aradiginiz TCNO' ya Ait Ogrenci Bulunmamaktadir!");
            menu(ogrList);
        }
        menu(ogrList);
    }


    private void arama(List<ogrenci> ogrList) {
        int flag = 0;
        System.out.println("Arama Yapilacak TCNO: ");
        String arancakTcNo = scan.next();
        for (ogrenci each:ogrList
             ) {
            if (arancakTcNo.equals(each.getTcNo())){
                System.out.println("Aradiginiz Ogrencinin Bilgileri: \n" + each);
                flag =1;
            }
        }
        if (flag == 0){
            System.out.println("Aradiginiz TCNO' ya Ait Ogrenci Bulunmamaktadir!");
            menu(ogrList);
        }
        menu(ogrList);
    }

    private void listele(List<ogrenci> ogrList) {
        for (ogrenci each:ogrList
             ) {
            System.out.println(each);
        }
        menu(ogrList);
    }

    private void ekleme(List<day_01.ogrenci> ogrList) {
        scan.nextLine();
        System.out.print("Ogrencinin Adini Giriniz: ");
        String ad = scan.nextLine();
        System.out.print("Ogrencinin Soyadini Giriniz: ");
        String sAd = scan.nextLine();
        System.out.print("Ogrencinin TCNO' sunu giriniz: ");
        String tcNo = scan.next();
        System.out.print("Ogrencinin Yasini Giriniz: ");
        int yas = scan.nextInt();
        System.out.print("Ogrencinin Sinifini Giriniz: ");
        int sinif = scan.nextInt();

        ogrenci = new ogrenci(ad, sAd, tcNo,yas, numara++, sinif);
        ogrList.add(ogrenci);
        listele(ogrList);
    }
}
