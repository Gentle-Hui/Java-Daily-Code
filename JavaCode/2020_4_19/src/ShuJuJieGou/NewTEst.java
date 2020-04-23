package ShuJuJieGou;

import java.util.Arrays;

public class NewTEst {
    //成员变量
    private int[] elem;//数组
    private int usedSize;//有效的数据个数
    private static final int intCapacity = 10;//初始容量
    private int length;

    //构造方法
    public NewTEst() {
        this.length = length;
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //成员方法
    //插入元素
    public void add(int pos, int data) {

        if (pos < 0 || pos > this.usedSize) {
            return;
        } else if (this.usedSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.length);
        }
        for (int i = this.usedSize - 1; i >= pos; i++) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }

    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {

        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }


    //获取pos位置的元素
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    public int getPos(int pos) {
        //1、顺序表是否为空   -1
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
        //2、pos 合法性
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法!");
        }
        return this.elem[pos];
    }

    //获取顺序表长度
    public int size() {
        return usedSize;
    }

    //删除第一次出现的关键字toRemove
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == 1) {
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //清除顺序表
    public void clear() {
        this.usedSize = 0;
    }
}