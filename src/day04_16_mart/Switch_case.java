package day04_16_mart;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        // kullanıcıdan bir harf isteyin
        // o harf ile başlayan gün ismi varsa yazdırın
        // yoksa geçersiz harf yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ulaşmak istediğiniz gün ismi için bir harf giriniz");
        char harf=scan.next().toUpperCase().charAt(0);




        switch (harf){
            case 'P':
                System.out.println("Pazartesi, Perşembe,Pazar");
                break;
            case 'S':
                System.out.println("Salı");
                break;
            case 'C':
                System.out.println("Carsamba, Cuma,Cumartesi");
                break;
            default:
                System.out.println("Hatalı giriş");

        }




    }
}