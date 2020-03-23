package Gouzaofangfa;

public class Gouzaofangfa {
    private String name;
    private int age;

    //构造方法
    //public Gouzaofangfa(){
     //   System.out.println("无参构造方法");
    //}
    //需要手动给出一个无参构造方法,因为一旦给出了构造方法系统将不再提供默认的无参构造方法
    public Gouzaofangfa(){}


    public Gouzaofangfa(String name){
        this.name=name;
    }

    public Gouzaofangfa(int age){
        this.age=age;
    }

    public Gouzaofangfa(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
