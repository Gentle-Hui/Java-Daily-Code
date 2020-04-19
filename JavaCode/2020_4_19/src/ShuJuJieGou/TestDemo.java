package ShuJuJieGou;

public class TestDemo {

    public static void main(String[] args) {
        NewTEst myArrayList = new NewTEst();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i, i);
        }
        myArrayList.display();
        myArrayList.getPos(4);
    }
}
