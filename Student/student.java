package Student;
//学生类
public class student {
    //成员变量
    String name;
    private int age;
//提供get/set方法
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }

    //成员方法
    public void study(){
        System.out.println("好好学习，天天向上。");
    }
    public void HomeWork(){
        System.out.println("键盘敲烂，月薪过万。");
    }
    public void Show(){
        System.out.println(name + "," + age);
    }
}
