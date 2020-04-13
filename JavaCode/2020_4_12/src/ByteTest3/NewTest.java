package ByteTest3;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        System.out.println("请输入你要判断的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Prime(num);

    }

    private static void Prime(int num) {
        int b = 0;
        for (b = 2; b < num; b++) {
            if (num % b == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        if (b >= num) {
            System.out.println("是素数");
        }

    }
}