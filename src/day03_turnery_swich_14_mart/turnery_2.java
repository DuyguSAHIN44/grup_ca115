package day03_turnery_swich_14_mart;

import java.util.Scanner;

public class turnery_2 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan notunu alin,
        50 veya daha buyukse "Sinifi Gectin",
        50’den kucukse "Maalesef kaldin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not >= 50) {

            System.out.println("Sinifi Gectin");

        } else {
            System.out.println("Maalesef kaldin");
        }
        System.out.println("===========================");

        System.out.println(not >= 50 ? "Sinifi Gectin" : "Maalesef kaldin");
    }
    }

