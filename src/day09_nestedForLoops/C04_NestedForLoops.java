package day09_nestedForLoops;

public class C04_NestedForLoops {

    public static void main(String[] args) {

  /*
        Verilen satir sayisina gore
        asagidaki sekli olusturan kod yaziniz
                *
                * *
                * * *
                * * * *
         */

        int satır=4;
        for (int i = 1; i <=4 ; i++) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

    }

