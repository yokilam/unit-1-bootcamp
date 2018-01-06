import java.util.Calendar;
import java.util.Date;

public class Bonus {

    public static void main(String args[]) {

        FizzBuzz(36);
        Collatz(13);
        Weekdays();
    }


    public static void FizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if (String.valueOf(i).contains("3") && String.valueOf(i).contains("5")) {
                System.out.println("FizzBuzz");
            } else if (String.valueOf(i).contains("3")) {
                System.out.println("Fizz");
            } else if (String.valueOf(i).contains("5")) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void ShorterFizzBuzz(int n) {
        for (int i = 0; i < n; i++, System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "") : i))
            ;
    }

    public static void Collatz(int maxN) {
        long count=0, largestCount = 0;
        while (maxN != 1) {
            System.out.print((maxN = (maxN % 2 == 0 ? maxN/ 2 : (3 * maxN) + 1))+ " ");
            count++;
        }
        if (count > largestCount) {
            largestCount = count;
            System.out.println("Count: " + largestCount);
        }
    }

    public static void Weekdays(){
        int counter=0;
        Calendar a= Calendar.getInstance();
        for (int year = 1901; year < 2000; year++) {
            for (int month = 1; month < 12; month++) {
                a.set(year, month, 1);
                int day_of_week= a.get(Calendar.DAY_OF_WEEK);
                if (day_of_week==7){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void Currency(){

    }


}

