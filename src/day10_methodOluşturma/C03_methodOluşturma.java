package day10_methodOluşturma;

import java.util.Scanner;

public class C03_methodOluşturma {
    public static void main(String[] args) {


        // Q-3 Kullanıcıdan alınan metnin tersini
        // bize döndüren bir method yazınız.

        System.out.println(tersineCevir("hava güzel"));
    }

    public static String tersineCevir(String str) {

        String tersMetin="";

        for (int i = str.length() - 1; i >= 0; i--) {
            tersMetin +=str.charAt(i);

        } return tersMetin;


    }
}

