package ByteTest2;

public class NewTest {
    public static void main(String[] args) {
        int a;
        for (a = 1; a <= 100; a++) {
            Prime(a);
        }
    }

    private static void Prime(int a) {
        int b = 0;
        for (b = 2; b < a; b++) {
            if (a % b == 0) {
                break;
            }
        }
        if (b >= a) {
            System.out.println(a);
        }
    }
}
