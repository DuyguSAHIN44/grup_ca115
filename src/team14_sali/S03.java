
package team14_sali;
import java.util.Arrays;
public class S03 {
    // Verilen String bir array’deki
    // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
    public static void main(String[] args) {
        String[] isimler = {"H.KADİR", "DUYGU","HAK HUKUK ADALET", "SU", "LATİFE", "MEHMET NURİ", "BETÜL"};
        System.out.println(Arrays.toString(isimler));
        // [H.KADİR, DUYGU, MRV, LATİFE, MEHMET NURİ, BETÜL]
        enKISAenUZUN(isimler);
    }
    public static void enKISAenUZUN(String[] arr) {
        String enkısa = arr[3];
        String enuzun = arr[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < enkısa.length()) {
                enkısa = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > enuzun.length()) {
                enuzun = arr[i];
            }
        }
        System.out.println("en kısa kelime: "+enkısa);
        System.out.println("en uzun kelime: "+enuzun);
    }
}
