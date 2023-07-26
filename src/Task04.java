import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int array[] = MyMath.createArray(10);
        System.out.println(MyMath.showArray(array));
        System.out.println("В какую сторону отсортировать?\n1 - Прямо\n0 - Обратно");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        MyMath.mySort(array, input);
        System.out.println(MyMath.showArray(array));
    }
}
