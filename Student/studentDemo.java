package Student;

//学生测试类
public class studentDemo {
    public static void main(String[] args) {
        //创建对象
        student s = new student();
        //使用对象

        s.name = "温荣辉";
        s.setAge(24);
        s.study();
        s.HomeWork();
        s.Show();
    }
}
