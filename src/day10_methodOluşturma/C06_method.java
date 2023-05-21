package day10_methodOluşturma;

import java.util.Scanner;

public class C06_method {
    // Q-2 Kullanıcıdan iki sayı alıp aradaki sayıları
    // toplayıp yazdıran bir method yazın
    public static void main(String[] args) {
        aradakiSayılarıTopla();
    }
    public static void aradakiSayılarıTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        int sayı1= scan.nextInt();
        int sayı2=scan.nextInt();

        int toplam=0;

        for (int i =sayı1; i <= sayı2; i++) {
            toplam+=i;

        }
        System.out.println("Girilen sayılar arasındaki sayılar toplamı: " +toplam);
    }
}
