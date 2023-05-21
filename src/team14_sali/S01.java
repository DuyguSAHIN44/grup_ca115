package team14_sali;
import java.util.Arrays;
public class S01 {
    // Verilen bir int array’in tum elemanlarini
    // istenilen artiş miktarı kadar artirip bize donduren bir method olusturun.
    public static void main(String[] args) {
        int[] sayilar = {2, 3, 4, 5, 1}; //
        sayilar=  elementArtirmaMethodu(sayilar,3);
        System.out.println(Arrays.toString(sayilar));
    }
    public static int[] elementArtirmaMethodu(int[] arr, int artisMiktari) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }
        return arr;
    }
}
