package day02_ilkDers_12_mart;

import java.util.Scanner;

public class ilkDers {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ismini, soyismini ve yaşını alıp, aşağıdaki formatta yazdırın

        İsminiz:John
        Soyisminiz:Doe
        Yaşınız:44
        Kaydınız başarıyla tamamlanmıştır yazınız

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyİsim= scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yaş= scan.nextInt();

        System.out.println("\tAdınız: " + isim +
                          "\n\tSoyadınız: " +soyİsim +
                          "\n\tYaşınız: " + yaş+



                   "\n ==========KAYDINIZ BAŞARIYLA TAMAMLANMIŞTIR========");
    }

}
