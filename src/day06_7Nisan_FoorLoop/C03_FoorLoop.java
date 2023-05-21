package day06_7Nisan_FoorLoop;

import java.util.Scanner;

public class C03_FoorLoop {
    public static void main(String[] args) {



        //Soru 4) Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz ");
        System.out.print("Baslangıç değeri : ");
        int baslangicDegeri= scan.nextInt();
        System.out.print("Bitiş değeri : ");
        int bitisDegeri= scan.nextInt();
        int toplam=0;

        if (bitisDegeri<baslangicDegeri){
            System.out.println("Baslangıç değeri bitiş değerinden küçük olmalıdır!!");
        }else {
            for (int i =baslangicDegeri; i <=bitisDegeri ; i++) {
                toplam+=i; // toplam=toplam+i

            }
            System.out.println("Girdiğiniz Değerlerin arasındaki sayıların toplamı : "+toplam);

        }



    }
    }

