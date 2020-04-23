package ByteTest;

/**
 * @program: 20200419
 * @description
 * @author: 温荣辉
 * @create: 2020-04-23 22:01
 **/


class Node{
    //定义单链表节点的两个部分data和next的对象
    public int data;
    public Node next;
    //构造方法
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }


}
public class LinkedList {
    //保存单链表的头节点的引用
    public Node head;
    //头插法
    public void addFirst(int data){

    }
    //尾插法
    public void addLast(int data){

    }
    //任意位置插入，第一个节点为0号下表
    public boolean addIndex(int index,int data){

        return true;
    }
    //查找是否包含关键字key是否在单链表中
    public boolean contains(int key){

        return true;
    }
    //删除第一次出现关键字key的节点
    public void remove(int key){

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //单链表的长度
    public int size(){

        return 0;
    }
    //遍历
    public void display(){

    }
    //清空
    public void clear(){

    }

}
