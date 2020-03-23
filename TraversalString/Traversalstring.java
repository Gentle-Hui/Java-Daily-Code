package TraversalString;

import java.util.Scanner;

public class Traversalstring {
    public static void main(String[] args) {
        //键盘录入字符串，用scanner实现
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //length方法获得字符串长度
        //System.out.println(line.length());
        //遍历字符串，首先要能够获取到字符串中的每个字符
        for(int i=0;i<=line.length();i++) {
            System.out.println(line.charAt(i));
        }

    }


}
