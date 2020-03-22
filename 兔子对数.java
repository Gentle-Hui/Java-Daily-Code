package com.itheima;
/*有一对兔子，从出生后第三个月后每个月生一对兔子，小兔子长到第三个月后每个月又生一对兔子
加入兔子不死，问第二十个月兔子的对数是多少？

 */
public class rubbit {
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for(int x=2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
        }
        System.out.println("第二十个月的兔子的对数是"+arr[19]);
    }
}
