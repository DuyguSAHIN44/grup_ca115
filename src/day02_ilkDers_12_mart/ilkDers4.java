package day02_ilkDers_12_mart;

import java.util.Scanner;

public class ilkDers4 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı alıp,
        üçüncü bir değişken kullanmadan ikisinin değerlerini değiştirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci tamsayıyı giriniz");
        int sayı1= scan.nextInt();
        System.out.println("Lütfen ikinci tamsayıyı giriniz");
        int sayı2=scan.nextInt();

        sayı1=sayı2+sayı1;
        sayı2=sayı1-sayı2;
        sayı1=sayı1-sayı2;

        System.out.println("sayı1: " +sayı1);
        System.out.println("sayı2: " +sayı2);
    }
}

