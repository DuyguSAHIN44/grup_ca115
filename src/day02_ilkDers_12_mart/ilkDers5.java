package day02_ilkDers_12_mart;

import java.util.Scanner;

public class ilkDers5 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ismini,
        soyismini
        ve yaşını alıp aşagıdaki formatta yazdırın
        girilen bilgiler: J Doe,44
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyİsim= scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yaş= scan.nextInt();

        System.out.println("girilen bilgiler: " + isim.charAt(0)+" "+ soyİsim +"," + yaş);
    }
}
