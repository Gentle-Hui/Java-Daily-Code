package StringText;
/*String构造方法
public String()创建一个空白字符串对象
public String(char[] chs)根据字符数组的方式创建字符串对象
public String(byte[] bys)根据字节数组的方式创建字符串对象
String s="abc"直接赋值创建字符串对象
 */
/*学习时有费了很大力才理解的地方
这个类实际上是测试类，上面的注释信息里面的构造方法相当于在另一个类中储存
然后下面的创造对象直接引用构造方法
但是String内置的很多构造方法不需要自己定义，这也是自己疑惑的地方
就是为什么没有构造对象这一步
*/
public class StringText {
    public static void main(String[] args) {
        //public String()创建一个空白字符串对象

        String s1=new String();
        System.out.println("s1:"+s1);

        //public String(char[] chs)根据字符数组的方式创建字符串对象
        char[] chs={'a','b','c'};
        String s2=new String(chs);
        System.out.println("s2:"+s2);
        //public String(byte[] bys)根据字节数组的方式创建字符串对象
        byte[] bys={98,99,100};
        String s3=new String(bys);
        System.out.println("s3:"+s3);
        //String s="abc"直接赋值创建字符串对象
        String s4="abc";
        System.out.println("s4:"+s4);
    }
}
