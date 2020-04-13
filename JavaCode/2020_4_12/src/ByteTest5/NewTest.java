package ByteTest5;

import java.util.Scanner;
import java.util.Random;

public class NewTest {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("要开始猜数字游戏了，请输入一个十以内的数字：");
            int user = sc.nextInt();

            if (user > num) {
                System.out.println("你猜大了！");
            } else if (user < num) {
                System.out.println("你猜小了！");
            } else {
                System.out.println("你猜对了！");
                break;
            }
        }
    }
}

