public final class Main {
    static int n;

    public static void main(String[] args) {
        schicksalszahl("24.9.1985");
        System.out.println();
    }

    public static void schicksalszahl(String zahl) {
        int result = 0;
        int newResult = 0;

        for (int i = 0; i < zahl.length() ; i++) {
            if (zahl.charAt(i) != '.') {
                result = Character.getNumericValue(zahl.charAt(i));
                newResult += result;
            }
        }
        String.valueOf(newResult);
        System.out.println(newResult);

        if (n != 20) {
            ++n;
            schicksalszahl(String.valueOf(newResult));
        }

    }
}
