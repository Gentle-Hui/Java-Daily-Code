package ByteTest4;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int teens = sc.nextInt();
        Check(teens);
    }

    private static void Check(int teens) {
        if (teens >= 0 && teens <= 18) {
            System.out.println("他还是个孩子啊");
        } else if (teens >= 19 && teens < 28) {
            System.out.println("小伙子，火力旺");
        } else if (teens >= 29 && teens < 55) {
            System.out.println("中年油腻老男人");
        } else if (teens > 56 && teens < 200) {
            System.out.println("老汉**");
        } else {
            System.out.println("你" + teens + "岁了？你成神了？");
        }
        System.out.println("end");
    }
}
