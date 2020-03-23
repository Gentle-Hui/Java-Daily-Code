package Gouzaofangfa;

public class GouzaofangfaDemo {
    public static void main(String[] args) {
        //创建对象
        Gouzaofangfa p1 = new Gouzaofangfa();
        p1.show();
        //public Gouzaofangfa(String name)
        Gouzaofangfa p2 = new Gouzaofangfa("温荣辉");
        p2.show();

        //public Gouzaofangfa(int age)
        Gouzaofangfa p3 = new Gouzaofangfa(24);
        p3.show();

        //public Gouzaofangfa(String name,int age)
        Gouzaofangfa p4=new Gouzaofangfa("温荣辉",24);
        p4.show();
    }
}
