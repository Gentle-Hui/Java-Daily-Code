package Userlogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        //已知用户名和密码，用定义两个字符串来表示
        String username = "GentleHui";
        String password = "gentlehui1002";
        //用循环实现多次机会，采用for循环，用break结束
        for (int i = 0; i < 3; i++) {


            //键盘录入数据，用scanner来实现
            Scanner sc = new Scanner(System.in);
            //接收数据
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入您的密码：");
            String pwd = sc.nextLine();
            //把键盘录入的用户名和密码与已知的用户名和密码进行比较，给出相应的提示，用equals方法实现
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账号已锁定，请与管理员联系解锁");
                    break;
                } else {
                    System.out.println("登陆失败，你还有" + (2-i) + "次机会");
                }

            }

        }

    }
}
