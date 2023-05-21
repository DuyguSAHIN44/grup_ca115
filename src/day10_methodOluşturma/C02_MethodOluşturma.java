package day10_methodOluşturma;

import java.util.Scanner;

public class C02_MethodOluşturma {
    // Q-2 Kullanıcıdan iki sayı alıp aradaki sayıları
    // toplayıp yazdıran bir method yazın

    public static void main(String[] args) {

        ikiSayıTopla();
    }
    public static void ikiSayıTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz");
        System.out.print("Birinci sayı: ");
        int sayı1= scan.nextInt();
        System.out.print("İkinci sayı sayı: ");
        int sayı2= scan.nextInt();


        System.out.println("toplam: "+ sayı2+sayı1);
    }



    }

