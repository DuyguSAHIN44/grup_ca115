
package team14_persembe;
public class P01 {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 3}, {8, 6, 3, 1}, {1, 3}, {10}, {3, 5}, {1, 3}};
        //  array in toplam elemement sayısı nedir ? // 14 element
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i].length;
        }
        System.out.println(toplam);
    }
}
