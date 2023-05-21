package day09_nestedForLoops;

public class C03_NestedForLoops {
    public static void main(String[] args) {


        // verilen satır sayısıyla aşağıdaki şekilde kod yazınız
        // * * * *
        // * * *
        // * *
        // *

        int satır =4;
        for (int i = 4; i >=1 ; i--) {
            for (int j =1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}



