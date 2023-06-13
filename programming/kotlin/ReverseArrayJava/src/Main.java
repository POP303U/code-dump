import java.util.Arrays;

public class Main {
    public static int[] array = {1,2,3,4,5,6,7};
    public static void main(String[] args) {
        String hello = Arrays.toString(reverse2(array));
        System.out.println(hello);
    }

    public static int[] reverse2(int[] arr) {
        int[] newArray = arr.clone();
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[index];
            index--;
        }
        return newArray;
    }
}