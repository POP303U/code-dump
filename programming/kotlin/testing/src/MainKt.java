import java.util.Scanner;
public final class MainKt {
    public static final void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        int rows = input.nextInt();
        System.out.println("How many columns do you want?");
        int columns = input.nextInt();
        System.out.println("What symbol do you want");
        String char1 = input.next();
        for (int i = 0; i > columns; i++) {
            System.out.print("");
            for (int j = 0; i > rows; j++) {
                System.out.println(char1);
            }
        }
    }
    public static void main(String[] args) {
        main();
    }
}
