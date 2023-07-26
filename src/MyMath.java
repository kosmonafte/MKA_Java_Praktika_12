import java.util.Arrays;

public class MyMath {
    public static int sumItem(int arr[]) {
        int sum = 0;
        for (int var:arr) {
            sum += var;
        }
        return sum;
    }
    public static int maxItem(int arr[]) {
        int max = arr[0];
        for (int var:arr) {
            if (var > max) {
                max = var;
            }
        }
        return max;
    }

    public static String items(int[] arr) {
        int array[] = new int[4];
        for (int var:arr) {
            if (var%2==0) {
                array[0]++;
            } else {
                array[1]++;
            }
            if (var > -1) {
                array[2]++;
            } else {
                array[3]++;
            }
        }
        String str = new String();
        str = "Четные - " + array[0] + ", нечетные - " + array[1] + ", положительные - " + array[2] + ", отрицательные - " + array[3] + ".";
        return str;
    }
    public static int[] createArray(int size) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*20-10);
        }
        return array;
    }
    public static String showArray(int arr[]) {
        String str = new String();
        for (int var:arr) {
            str += var + " ";
        }
        return str;
    }

    public static void mySort(int arr[], int side) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (side == 1) {
                    if(arr[i] > arr[i+1]){
                        isSorted = false;
                        buf = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buf;
                    }
                } else if (side == 0) {
                    if(arr[i] < arr[i+1]){
                        isSorted = false;
                        buf = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buf;
                    }
                }
            }
        }
    }

    public static int[] reverse(int arr[]) {
        int array[] = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            array[j] = arr[i];
        }
        return array;
    }

    public static int indexItem(int arr[], int ind) {
        int index;
        Arrays.sort(arr);
        index = Arrays.binarySearch(arr, ind);
        return index;
    }

    public static int fact(int number) {
        int fct;
        if (number == 1) {
            return 1;
        } else if (number == 2){
            return 2;
        } else {
            return fact(number - 1) * number;
        }
    }

    public static int[] factArray(int arr[]) {
        int array[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = fact(arr[i]);
        }
        return array;
    }
}
