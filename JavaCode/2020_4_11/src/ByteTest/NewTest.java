package ByteTest;

public class NewTest {

    public static void main(String[] args) {
        int x = 0;
        while (x < 3) {
            x++;
        }
        System.out.println("x=" + x);

        for (int y = 0; y < 3; y++) {
            System.out.println("y=" + y);
        }

/*
这就是for与while的区别
1，变量都有自己的作用域，对于for来讲：如果用于控制循环的增量定义在for语句中，
那么该变量只在for循环内有效（减少内存使用）
2，for和while可以进行转换，如果需要定义循环增量，for更合适
 */
    }
}

