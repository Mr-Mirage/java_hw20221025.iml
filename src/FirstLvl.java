import java.util.Arrays;

public class FirstLvl {
    public static void main(String[] args) {
        //�������� ������ �������� 100 ��������, ��������� ��� ������ ��������� 10.
        //1 � 99 ������ ��������� ����������, ������� 0

        int[] array = new int[100];

        for (int i = 1; i < 99; i++) {
            array[i] = 10;
        }
        System.out.print(Arrays.toString(array));

    }
}