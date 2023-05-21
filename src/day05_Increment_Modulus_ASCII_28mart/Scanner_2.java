package day05_Increment_Modulus_ASCII_28mart;

public class Scanner_2 {
    public static void main(String[] args) {

        // a+b+c=?

        int a = 3;
        int b = 1;
        int c = 0;

        a = a + 1; // a=4
        b += a; // a=4 , b=4 (önce atadık) daha sonra b yi 1 arttır   b=5
        b = a++; // b=4, a=5
        c = ++a;// a=6 c=6

        // En güncel hali: a=6, b=4, c=6  =====>6+4+6=16

        System.out.println(a + b + c);


    }
}