package ByteTest;

public class NewTest {
    public static void main(String[] args) {
        GetChar();
    }
    private static void GetChar() {
        int count=0;
        for(int i=1;i<=100;i++){
            if(i/10==9){
                count++;
                System.out.println(i);
            }else if(i%10==9){
               count++;
                System.out.println(i);
            }
        }
        count=count+1;
        System.out.println("一共出现"+count+"次九");
    }
}
