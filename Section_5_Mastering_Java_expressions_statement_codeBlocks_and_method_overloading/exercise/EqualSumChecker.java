public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, 2, 3));
        System.out.println(hasEqualSum(2, 2, 2));
        System.out.println(hasEqualSum(3, 2, 1));
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum == thirdNum;
    }
}
