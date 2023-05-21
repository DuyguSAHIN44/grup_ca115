package day08_switchCase_13Nisan;

import java.util.Scanner;

public class C05_switchStatements {
    public static void main(String[] args) {

        // SORU 5:Kullanıcıdan gün numarasını alıp
        // hafta içi veya hafta sonu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen girilecek gün için numara yazınız");
        int girilenNo= scan.nextInt();

        switch (girilenNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız");

        }




    }
}
