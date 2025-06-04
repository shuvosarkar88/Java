public class TenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 59, 30));
        System.out.println(hasTeen(10, 19, 13));
    }


    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}
