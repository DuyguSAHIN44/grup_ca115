package day09_nestedForLoops;

public class C01_NestedForLoops {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
         * * * * *
         * * * * *
         * * * * *
         */

        int sütunSayısı=5;
        int satırSayısı=3;

        for (int i = 1; i <=satırSayısı ; i++) { // satırlar
            for (int j = 1; j <=sütunSayısı ; j++) {  // sütunlar
                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}



