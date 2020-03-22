package com.itheima;

import java.util.Scanner;

public class HelloWRH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的分数");
        int score = sc.nextInt();
        if (score >= 95 && score <= 100) {
            System.out.println("奖励山地车一辆");
        } else if (score >= 90 && score < 95) {
            System.out.println("奖励游乐场游玩一次");
        } else if (score >= 80 && score < 90) {
            System.out.println("奖励变形金刚一个");
        } else if (score < 80) {
            System.out.println("考这么点分等着挨揍吧");
        } else {
            System.out.println("有这个分数吗，敢糊弄你爹？等着挨揍吧兔崽子！");
        }
        System.out.println("end");
    }
}