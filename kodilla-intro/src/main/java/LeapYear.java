public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;


        System.out.println("Is leap year:    "  + year + leapYear(year));

    }

   static boolean leapYear(int year) {

        if (!(year % 4 == 0)) {
            return false;
        }
        else if((!(year % 2 == 0))){
            return false;
        }
                else if (!(year % 100 == 0)) {
                return true;


            } else if(year % 400 ==0){
                return true;
            }else{
                    return false;
            }}}
