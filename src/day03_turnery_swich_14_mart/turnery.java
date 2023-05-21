package day03_turnery_swich_14_mart;

import java.util.Scanner;

public class turnery {
    public static void main(String[] args) {
       /*
        Soru 1- Kullanicidan bir sayi isteyin,
         sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilenSayı = scan.nextInt();

        if (girilenSayı % 5 == 0) {
            System.out.println("Sayı 5 in tam katı");

        }

        System.out.println("==============");

        System.out.println(girilenSayı % 5 == 0 ? "Sayı 5 in tam katı" : "");

        String sonuç= girilenSayı % 5 == 0 ? "Sayı 5 in tam katı" : "";
        System.out.println(sonuç);

        int sayı=15;
        System.out.println(sayı>5 ?"sayı 5 den büyüktür": sayı*2);
        // int ve String sonuç old için sout a aldık

        /*
        Turnery de 2 çeşit yazım kuralı vardır
        1) sout şeklinde yazmak
        2) turnary da bize dönecek data türüne göre bir variable
        oluşturmak ve variableyi yazmak
        3)Dönecek sonucu data türleri aynı ise dönecek sonuç bir
        variableye atanabilir
        Aynı değilse sonuç bir variable atanamaz.O zaman sout un içinde yazılır.
        Sout un gönlü çok geniştir ben yazdırmam demez.
         */


    }
}



