package day09_nestedForLoops;

public class C02_NestedForLoops {
    public static void main(String[] args) {

        /*
        1                   1. satir 1’den 1’e kadar yazdir
        1  2                2. satir 1’den 2’e kadar yazdir
        1  2  3             3. satir 1’den 3’e kadar yazdir
        1  2  3  4.         4. satir 1’den 4’e kadar yazdir
         */

        int satır =4;
        for (int i = 1; i <=satır ; i++) {  // satırlar
            for (int j = 1; j <=i ; j++) {  // sütunlar
                System.out.print(j + " ");
            }
            System.out.println("");   // diğer satıra geçirme adımı
        }


    }

    }

