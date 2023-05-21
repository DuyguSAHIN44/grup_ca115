package day05_Increment_Modulus_ASCII_28mart;

import java.util.Scanner;

public class Scanner_3 {

    public static void main(String[] args) {


        // Soru-5) Kullanıcıdan üç basamaklı bir sayı alın

        // ve sayının rakamlar toplamını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz");
        int girilenSayi = scan.nextInt();

        int rakamlarToplamı=0;
        int birlerBasamagı=girilenSayi % 10;
        girilenSayi/=10;
        int onlarBasamagı=girilenSayi % 10;
        girilenSayi/=10;
        int yuzlerBasamagı=girilenSayi;

        rakamlarToplamı=birlerBasamagı+onlarBasamagı+yuzlerBasamagı;

        System.out.println("Girilen üç basamaklı sayının rakamlar toplamı : " +rakamlarToplamı);

    }
}































