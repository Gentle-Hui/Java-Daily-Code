package ByteTest;

/**
 * @program: 20200419
 * @description
 * @author: 温荣辉
 * @create: 2020-04-22 23:09
 **/
public class NewTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
       /* myList.addFirst(10);
        myList.addFirst(11);
        myList.addFirst(12);
        myList.addFirst(13);
        myList.addFirst(14);*/
        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(5);
        myList.addLast(6);
        myList.display();
        System.out.println(myList.contains(4));
        System.out.println(myList.size());
    }


}
