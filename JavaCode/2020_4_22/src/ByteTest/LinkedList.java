package ByteTest;

import java.util.SplittableRandom;

/**
 * @program: 20200419
 * @description
 * @author: 温荣辉
 * @create: 2020-04-23 22:01
 **/


class Node {
    //定义单链表节点的两个部分data和next的对象
    public int data;
    public Node next;

    //构造方法
    public Node(int data) {
        this.data = data;
        this.next = null;
    }


}

public class LinkedList {
    //保存单链表的头节点的引用
    public Node head;


    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);//这句代码就实现了一个不确定地址，next为空，存在数据的节点
        if(this.head==null){
            //如果第一次插入节点
            this.head=node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;
        }

    }

    //任意位置插入，第一个节点为0号下表
    public boolean addIndex(int index, int data) {

        return true;
    }

    //查找是否包含关键字key是否在单链表中
    public boolean contains(int key) {

        return true;
    }

    //删除第一次出现关键字key的节点
    public void remove(int key) {

    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }

    //单链表的长度
    public int size() {

        return 0;
    }

    //遍历
    public void display() {
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }

    }

    //清空
    public void clear() {

    }

}
