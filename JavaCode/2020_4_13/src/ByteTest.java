public class ByteTest {
    import java.util.Scanner;
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("=================");
        for (int val : array) {

            System.out.println(val + " ");
        }
    }

}
