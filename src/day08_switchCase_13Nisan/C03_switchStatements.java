package day08_switchCase_13Nisan;

import java.util.Scanner;

public class C03_switchStatements {
    public static void main(String[] args) {

        // SORU 3: Kullanıcıdan ay numarasını alıp ay ismini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen girmek istediğiniz ay numarasını yazınız");
        int girilenNo = scan.nextInt();

        switch (girilenNo) { // 1.KURAL: Long,double, float ve blooean BURADA KULLANILAMAZ
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız");


        }
    }
}