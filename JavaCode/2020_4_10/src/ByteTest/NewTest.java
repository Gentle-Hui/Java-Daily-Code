package ByteTest;

public class NewTest {



    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("开心");


        byte b=12;
        byte c=21;
        System.out.println(b+" "+c);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //byte d= Byte.MAX_VALUE+1;
        System.out.println(Byte.MAX_VALUE+1);

    }


}
