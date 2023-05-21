package day08_switchCase_13Nisan;

import java.util.Scanner;

public class C02_switchStatements {
    public static void main(String[] args) {

        // SORU 2: Kullanıcıdan 2 basamaklı bir sayı alıp, girilen sayıyı yazı ile yazdırın

                Scanner scanner = new Scanner(System.in);
                System.out.print("Lütfen 2 basamaklı bir sayı giriniz: ");
                int sayi = scanner.nextInt();

                if (sayi < 10 || sayi > 99) {
                    System.out.println("Girdiğiniz sayı 2 basamaklı değil!");
                    return;
                }

                int birlerBasamagi = sayi % 10;
                int onlarBasamagi = sayi / 10;

                String birlerBasamagiYaziyla = "";
                String onlarBasamagiYaziyla = "";

                switch (onlarBasamagi) {
                    case 1:
                        onlarBasamagiYaziyla = "on";
                        break;
                    case 2:
                        onlarBasamagiYaziyla = "yirmi";
                        break;
                    case 3:
                        onlarBasamagiYaziyla = "otuz";
                        break;
                    case 4:
                        onlarBasamagiYaziyla = "kırk";
                        break;
                    case 5:
                        onlarBasamagiYaziyla = "elli";
                        break;
                    case 6:
                        onlarBasamagiYaziyla = "altmış";
                        break;
                    case 7:
                        onlarBasamagiYaziyla = "yetmiş";
                        break;
                    case 8:
                        onlarBasamagiYaziyla = "seksen";
                        break;
                    case 9:
                        onlarBasamagiYaziyla = "doksan";
                        break;
                }

                switch (birlerBasamagi) {
                    case 0:
                        birlerBasamagiYaziyla = "";
                        break;
                    case 1:
                        birlerBasamagiYaziyla = "bir";
                        break;
                    case 2:
                        birlerBasamagiYaziyla = "iki";
                        break;
                    case 3:
                        birlerBasamagiYaziyla = "üç";
                        break;
                    case 4:
                        birlerBasamagiYaziyla = "dört";
                        break;
                    case 5:
                        birlerBasamagiYaziyla = "beş";
                        break;
                    case 6:
                        birlerBasamagiYaziyla = "altı";
                        break;
                    case 7:
                        birlerBasamagiYaziyla = "yedi";
                        break;
                    case 8:
                        birlerBasamagiYaziyla = "sekiz";
                        break;
                    case 9:
                        birlerBasamagiYaziyla = "dokuz";
                        break;
                }

                System.out.println(onlarBasamagiYaziyla + " " + birlerBasamagiYaziyla);
            }

        }


