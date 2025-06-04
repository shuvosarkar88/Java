public class PositiveNegativeZero {

    public static void main(String[] args) {
        chekNumber(12);
        chekNumber(-2);
        chekNumber(0);
    }

    public static void chekNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
