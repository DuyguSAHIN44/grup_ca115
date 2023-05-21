package day01_if_else_9_mart;

import java.util.Scanner;

public class if_else_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int not=scan.nextInt();

        if(not>=85){
            System.out.println("Notunuz : AA" );

        } else if (not>=65) {
            System.out.println("Notunuz: BB");
        } else if (not>=50) {
            System.out.println("Notunuz :CC");

        }else{
            System.out.println("Notunuz : DD");
        }

    }
}
