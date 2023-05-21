package day06_7Nisan_FoorLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {


        //Soru 3) Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 20 den küçük bir sayı girin");
        int girilenSayı= scan.nextInt();
        int faktöriyel=0;

        for (int i = girilenSayı; i <=1; i--) {
            faktöriyel*=i;//fak=fak*i

        }
        System.out.println(girilenSayı+"!"+faktöriyel);


    }
    }

