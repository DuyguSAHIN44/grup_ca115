package day01_if_else_9_mart;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu kg olarak ve boyunuzy (cm) olarak giriniz");
        double kilo = scan.nextDouble();
        double boy = scan.nextDouble();

        double vki = ((kilo * 10000) / (boy * boy));
        System.out.println("vücut kitle indekdi : " + vki);

        if (vki > 30) {
            System.out.println("obez");
        } else if (vki > 25 && vki < 30) {
            System.out.println("kilolu");

        } else if (vki > 20 && vki < 25) {
            System.out.println("normal");

        } else {
            System.out.println("zayıf");
        }
    }
}


