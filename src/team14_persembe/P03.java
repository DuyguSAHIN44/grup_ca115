
package team14_persembe;
public class P03 {
    public static void main(String[] args) {
        int[][] arr = {{2, 5, 4}, {8, 6, 3, 1}, {1, 3}, {10}};
        // çift sayı adedi ; 5
        // tek sayı adedi  ; 5
        // array de kaç tane çift sayı olduğunu bulun
        // array de kaç tane tek sayı vardır.
        int flag = 0;
        for (int i = 0; i < arr.length; i++) { // dış array
            for (int j = 0; j < arr[i].length; j++) { // iç array
                if (arr[i][j] % 2 == 0) {
                    flag++;
                }
            }
        }
        System.out.println("çift sayı adedi: " + flag);
        int flag2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!(arr[i][j] % 2 == 0)) {
                    flag2++;
                }
            }
        }
        System.out.println("tek sayı adedi: "+flag2);
    }
}
