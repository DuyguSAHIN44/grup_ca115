
package team14_persembe;
import java.util.Arrays;
public class genelDeğerlendirme { //ÇİFT KATLILAR

    public static void main(String[] args) {
        //2 kısım katlı MDA ler. perşembe
        int[][] sayilar = {{1, 2}, {3, 4, 5}, {1, 2, 3, 4}};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        System.out.println(Arrays.deepToString(sayilar));
        System.out.println(Arrays.toString(sayilar[0]));
        System.out.println(sayilar.length); //3
        System.out.println(sayilar[2].length); //4
    }
}