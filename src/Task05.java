public class Task05 {
    public static void main(String[] args) {
        int array[] = MyMath.createArray(10);
        System.out.println(MyMath.showArray(array));
        array = MyMath.reverse(array);
        System.out.println(MyMath.showArray(array));
    }
}
