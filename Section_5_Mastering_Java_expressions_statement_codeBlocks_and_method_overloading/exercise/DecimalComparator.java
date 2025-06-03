public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(1.123, 1.123));
        System.out.println(areEqualByThreeDecimalPlaces(1.123, 2.123));
        System.out.println(areEqualByThreeDecimalPlaces(1.123, 1.125));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int a = (int) (num1 * 1000);
        int b = (int) (num2 * 1000);

        return a == b;
    }
}
