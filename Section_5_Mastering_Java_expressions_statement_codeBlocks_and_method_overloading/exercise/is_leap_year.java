public class is_leap_year {
    
    public static void main(String[] args) {
        System.out.println(isLeapYear(5000));
        System.out.println(isLeapYear(2025));
        System.out.println(isLeapYear(2024));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year%4 == 0) {
            if (year%100 == 0) {
                return year%400 == 0;
            } else {
                return true;
             }
        } 

        return false;
    }
}
