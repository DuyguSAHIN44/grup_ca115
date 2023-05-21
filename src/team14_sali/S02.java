package team14_sali;
public class S02 {
    //  Verilen bir array’de istenen bir elemanin var olup olmadigini
    //  ve varsa kac kere kullanildigini yazdiran bir method olusturun.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 3, 7, 8, 8};
        elementBulmaMethodu(arr,8);
        elementBulmaMethodu(arr,1);
        elementBulmaMethodu(arr,7);
        elementBulmaMethodu(arr,0);
        elementBulmaMethodu(arr,9);
    }
    public static void elementBulmaMethodu(int[] arr, int arananElement){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananElement){
                sayac++;
            }
        }
        System.out.println("verilen arryde "+arananElement+", "+sayac+" adet vardır");
    }
}