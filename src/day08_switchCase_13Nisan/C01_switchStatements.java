package day08_switchCase_13Nisan;

import java.util.Scanner;

public class C01_switchStatements {
    public static void main(String[] args) {


        // Soru 1: Kullanıcıdan bir rakam alıp, rakamı yazıyla yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam= scan.nextInt();

        switch (rakam){
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız");








        }


    }
}
