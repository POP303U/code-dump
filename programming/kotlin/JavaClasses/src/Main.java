import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 1);
        System.out.println(cat1.toString());
        cat1.ausgabe();
        cat1.setAge(3);
        System.out.println(cat1.toString());
        Cat cat2 = new Cat("Tim", 5);
        cat2.ausgabe();
 //     cat2.ausgabe2();
        cat1.toString();
        int[] arr = {1,5,6,2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }
        System.out.print("\n");
        for (int x : arr) {
            System.out.println(x);
        }

    }
}