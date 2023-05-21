package team14_persembe;
public class P02 {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 4}, {8, 6, 3, 2}, {1, 3}, {11}}; // 44
        // tüm elementlerin toplamını bulun
        // kaç katlı arry ise tüm elemetler ile işlem yapılacaksa
        // kat sayısı kadar for loop oluşturlur.
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) { // dış arry kontrol eder
            for (int j = 0; j < arr[i].length; j++) { // iç arry kontrol etti
                toplam += arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}