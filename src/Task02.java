public class Task02 {
    public static void main(String[] args) {
        int array[] = MyMath.createArray(5);
        int max = MyMath.maxItem(array);
        System.out.println(MyMath.showArray(array));
        System.out.println(max);
    }
}
