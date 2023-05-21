package day08_switchCase_13Nisan;

import java.util.Scanner;

public class C04_switchStatements {
    public static void main(String[] args) {

        // SORU 4:Kullanıcıdan ISTQB kısaltmasından harfin anlamını öğrenmek istedğini alın
        //ve girlen harfin karşılığını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ISTQB kısaltmasındaki harflerden birini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'I':
            System.out.println("International");
            break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Geçersiz harf");
        }

    }
}
