package day06_7Nisan_FoorLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //  100'den baslayarak 1'e kadar (sinirlar dahil) 7 ile bolunebilen sayilari yazdirin


        for (int i = 100; i >1 ; i--) {
            if (i%7==0){
                System.out.println(i+" ");
            }


        }
    }
}
