package ByteTest1;
import java.util.Scanner;
public class NewTest {
    public static void main(String[] args) {
        System.out.println("请输入你想判断是否是闰年的年份：");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        LeapYear(year);
    }

    private static void LeapYear(int year) {
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
