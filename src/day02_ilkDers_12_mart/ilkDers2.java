package day02_ilkDers_12_mart;

import java.util.Scanner;

public class ilkDers2 {
    public static void main(String[] args) {
        /*
        Kıllanıcıdan bir dikdöertgenin 2 kenar uzunluğunu alıp,
        dikdörtgenin alanını yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdöertgenin kısa kenarını giriniz");
        int kısaKenar= scan.nextInt();
        System.out.println("Lütfen dikdöertgenin uzun kenarını giriniz");
        int uzunKenar=scan.nextInt();

        System.out.println("Dikdörtgenin alanı: " + kısaKenar*uzunKenar);
    }
}
