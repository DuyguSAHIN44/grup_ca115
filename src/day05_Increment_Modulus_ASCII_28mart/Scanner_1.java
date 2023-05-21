package day05_Increment_Modulus_ASCII_28mart;

import java.util.Scanner;

public class Scanner_1 {


    public static void main(String[] args) {


      // Soru-2) Kullanıcıdan bir harf alın ve alfabede o harften sonraki üç harfi yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);

        System.out.println("Girilen harften sonraki harfler sırasıyla : " +
                        ((char) (girilenHarf + 1)) + ", " +
                        ((char) (girilenHarf + 2)) + ", " +
                        ((char) (girilenHarf + 3)));
        System.out.println("Girilen harften sonraki harfler sırasıyla : " + (++girilenHarf) +", "+ (++girilenHarf) +", " + (++girilenHarf));




















           //  Scanner scan=new Scanner(System.in);
//
           // System.out.print("Lütfen bir harf giriniz : ");
           // char girilenHarf =scan.next().charAt(0);
//
           //System.out.print("Girilen harften sonraki harfler sırasıyla : " +
           //                 ((char) (girilenHarf + 1)) + ", " +
           //                 ((char) (girilenHarf + 2)) + ", " +
           //                 ((char) (girilenHarf + 3)));
//
           // System.out.println("===================================");
//
           // System.out.println("Girilen harten sonraki harfler sırasıyla : " + (++girilenHarf) + (++girilenHarf) + (++girilenHarf));

        }










            }




