public class Main {
    public static void main(String[] args) {
        System.out.println(isNumeric("Hi!"));
        System.out.println(isNumeric("123"));
    }
    public static boolean isNumeric(String strNum) {
        try   {double d = Integer.parseInt(strNum);}
        catch (NumberFormatException nfe) {return false;}
        return true;
    }
}