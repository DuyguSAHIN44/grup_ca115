package team14_persembe;
public class P04 {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 3}, {8, 6, 3, 1}, {6, 5}, {10}};
        // 5 ile 10 arasında kalan sayılar dahil (5 ve 10) toplamını bulun
        // 29
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) { // dış array
            for (int j = 0; j < arr[i].length; j++) { // iç array
                if (arr[i][j] > 5 && arr[i][j] < 10) {
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("verilen aralıktaki sayıların toplamı: "+toplam);
    }
}
