package day03_turnery_swich_14_mart;

import java.util.Scanner;

public class nested_turnary {
    public static void main(String[] args) {

        /*
        Ornek : Kullanicidan bir tamsayi alin.
         Sayi pozitifse,
         cift sayi veya cift sayi degil seceneklerinden uygun olani
        yazdirin
        Sayi pozitif degilse,
         3 basamakli veya 3 basamakli degil seceneklerinden
        uygun olani yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int girilenSayı= scan.nextInt();

       if(girilenSayı>0){
           if (girilenSayı%2==0){
               System.out.println("Çift sayıdır");
           }else {
               System.out.println("Çift sayı değildir");
           }


       } else if (girilenSayı<0) {
           if (girilenSayı>-1000 && girilenSayı<-100){
               System.out.println("Sayı üç basamaklıdır");
           }else {
               System.out.println("Sayı üç basamaklı değildir");
           }

           System.out.println("?????????????????????????*");



       }


    }
}
