package day02_ilkDers_12_mart;

import java.util.Scanner;

public class ilkDers3 {
    public static void main(String[] args) {


    /*
    Kullanıcıdan iki sayı alıp,
    değerlerini değiştirin
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı tamsayı olarak giriniz");
        int sayı1= scan.nextInt();
        System.out.println("Lütfen ikinci sayıyı tamsayı olarak giriniz");
        int sayı2= scan.nextInt();

        int temp=0;

        temp=sayı2;
        sayı2=sayı1;
        sayı1=temp;

        System.out.println("sayı1 : "+ sayı1);
        System.out.println("sayı2 : "+ sayı2);


    }
}