public class Main {
    public static Integer[] array = new Integer[3];

    public static void main(String[] args) {
        array[0] = 1;
        array[1] = 4;
        array[2] = 10;
        anzahlKleiner(array);
    }

    public static void anzahlKleiner(Integer[] arr) {
        int result = 0;
        int numbersSmaller = 0;
        int arraySum = 0;

        for (Integer value : arr) {
            arraySum += value;
        }

        for (Integer value : arr) {
            if (arraySum/ arr.length > value) {
                numbersSmaller++;
            }
            result += value;
        }

        System.out.println("Der Mittelwert ist " + result / arr.length + "\n"
                + "Es gibt " + numbersSmaller + " zahlen kleiner als der Mittelwert");
    }


}