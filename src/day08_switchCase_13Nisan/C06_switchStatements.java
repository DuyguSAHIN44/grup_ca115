package day08_switchCase_13Nisan;

import java.util.Scanner;

public class C06_switchStatements {
    public static void main(String[] args) {

        // SORU 6: Kullanıcıdan ay numarasını alıp
        // mevsimi yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen girmek istediğiniz ay numarasını yazınız");
        int girilenNo = scan.nextInt();

        switch (girilenNo) { // 1.KURAL: Long,double, float ve blooean BURADA KULLANILAMAZ
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız");


        }
    }
}
