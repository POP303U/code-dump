public class Main {
    public static void main(String[] args) {
        // System.out.println(crossSum("123456789"));
        System.out.println(sumDigits(12345));
    }

    public static int crossSum(String n) {
        if (n.matches("[0-9]+")) {
            int sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += Character.getNumericValue(n.charAt(i));
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static long sumDigits(long i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}
