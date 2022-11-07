import java.util.Arrays;

public class FirstLvl {
    public static void main(String[] args) {
        //—оздайте массив размером 100 символов, заполните все €чейки значением 10.
        //1 и 99 €чейки заполните значени€ми, равными 0

        int[] array = new int[100];

        for (int i = 1; i < 99; i++) {
            array[i] = 10;
        }
        System.out.print(Arrays.toString(array));

    }
}