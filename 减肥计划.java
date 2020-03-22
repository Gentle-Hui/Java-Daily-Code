package com.itheima;
/*需求：输入星期数，显示今天的减肥计划
周一跑步
周二游泳
周三慢走
周四骑车
周五拳击
周六爬山
周日好好吃一顿
 */

import java.util.Scanner;

public class WeightLossPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        if(week<1||week>7){
            System.out.println("你输入的星期数有误");
        }else if(week==1){
            System.out.println("跑步");
        }else if(week==2){
            System.out.println("游泳");
        }else if(week==3){
            System.out.println("慢走");
        }else if(week==4){
            System.out.println("动感单车");
        }else if(week==5){
            System.out.println("拳击");
        }else if(week==6){
            System.out.println("爬山");
        }else if(week==7){
            System.out.println("好好吃一顿");
        }
    }
}
