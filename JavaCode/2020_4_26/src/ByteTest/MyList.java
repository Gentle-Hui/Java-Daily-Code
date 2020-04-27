package ByteTest;

/**
 * @program: 20200419
 * @description
 * @author: 温荣辉
 * @create: 2020-04-26 18:39
 **/
class Node {
    public int data;//数据
    public Node next;//后继信息
    public Node prev;//前驱信息

    public Node(int data) {
        this.data = data;
    }
}

public class MyList {
    public Node head;//双向链表的头
    public Node tail;//双向列表的尾

    //打印函数
    public void display() {
        Node cur = this.head;
        while (cur != null) {//从根节点由前向后输出
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            //如果第一次插入节点
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            //如果第一次插入节点
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    }

    //查找是否包含关键字key在单链表中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //任意位置插入
    private void checkIndex(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法");
        }
    }

    private Node searchIndex(int index) {
        Node cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public void addInsert(int index, int data) {
        checkIndex(index);
        Node node = new Node(data);
        Node cur = searchIndex(index);
        if (this.head == null) {
            //如果第一次插入节点
            this.head = cur;
            this.tail = cur;
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    //清除
    public void clear(){
        Node cur=this.head.
    }
}
