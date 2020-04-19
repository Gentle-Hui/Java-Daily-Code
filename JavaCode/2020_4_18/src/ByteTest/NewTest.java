package ByteTest;


public class NewTest {
    public static void main(String[] args) {
        double ret = 0.0;
        double n = 0;
        double r = 1;
        for (int i = 1; i <= 100; i++) {
            n = Math.pow(-1, i - 1);
            ret += n * (r / i);
        }
        System.out.println(ret);

    }

    public static void main1(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double num = 0.0;
        double n = 1;
        for (double i = 1; i <= 100; i++) {
            num += n / i;
            n = -n;
        }
        System.out.println(num);
    }

}
