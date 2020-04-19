package ByteTest1;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);
    }

    public static void gcd(int x, int y) {
        int result = 0; // 最大公约数
        int min = x > y ? y : x; // 两个整数中最小的数
        if (x == y) {
            result = x;
        } else {
            for (int i = min; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}
