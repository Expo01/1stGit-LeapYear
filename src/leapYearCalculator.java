public class leapYearCalculator {

    public static boolean isLeapYear(int year){
        if ((year < 1 || year > 9999) || (year % 4 != 0)){
            return false;
        } else if ((year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else return false;
    }

}
