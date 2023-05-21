
package team14_sali;
import java.util.Arrays;
public class S04 {
    // verilen bir array'e istenen bir elementi ekleyip,
    // yeni halini bize donduren bir method olusturun
    // verilen bir array'e istenen bir elementi ekleyip,
    // yeni halini yazdırın
    public static void main(String[] args) {
        int[] sayilar = {1, 4, 3,8,9,11,14,6};
        int eklenecekElement = 2;
        int[] YeniSayilar = new int[sayilar.length + 1];
        System.out.println(Arrays.toString(sayilar));
        System.out.println("*****");
        System.out.println(Arrays.toString(YeniSayilar)); // [0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < sayilar.length; i++) {
            YeniSayilar[i] = sayilar[i];
        }
        System.out.println(Arrays.toString(YeniSayilar)); // [1, 4, 3, 8, 9, 6, 0]
        YeniSayilar[YeniSayilar.length-1]=eklenecekElement;
        System.out.println("<<<<<<<<<<>>>>>>>>>>>>");
        System.out.println(Arrays.toString(YeniSayilar));
        //[1, 4, 3, 8, 9, 11, 14, 6, 2]
        System.out.println(YeniSayilar[5]);
    }
}
