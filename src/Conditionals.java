/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {

    }

    //1
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    //2
    public boolean isMultipleOfThree(int n) {
        return n % 3 == 0;
    }

    //3
    public boolean isOddAndIsMultipleOfThree(int n) {
        return n % 3 == 0;
    }

    //4
    public boolean isOddAndIsMultipleOfThree2(int n) {
        return isOdd(n) && isMultipleOfThree(n);
    }

    //5
    public void fizzMultipleofThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    //-----Person.java---------
    //5
    public boolean isFromLondon(Person person) {
        return person.getCity().equals("London");
    }

    //6
    public void printsName(Person person) {
        if (person.getName().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    //-----Exercise ++ --------
    //1
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && (cigars <= 60 || isWeekend == true)) {
            return true;
        } else {
            return false;
        }
    }

    //2
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed >= 66 && speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
        if (speed <= 60) {
            return 0;
        } else if (speed >= 61 && speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    //3
    public String alarmClock(int day, boolean vacation) {
        if(!vacation) {
            if (day >=1 && day <= 5){
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (day >=1 && day <=5) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    //4
    public int lotteryTicket(int a, int b, int c) {
        if ( a == b && a == c) {
            return 20;
        } else if ( a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    //5
    public int blackkJack(int a, int b) {
        if (a > 21 && b >21) {
            return 0;
        } else if ( 21-a < 21-b || b > 21) {
            return a;
        } else if ( 21-b < 21-a || a > 21) {
            return b;
        } else {
            return 0;
        }
    }

    //6
    public boolean evenlySpaced(int a, int b, int c) {
        if(a==b && b==c) return true;
        if(a==b || a==c || b==c) return false;
        return ((Math.abs(a-b)== Math.abs(b-c))
                || (Math.abs(a-c)==Math.abs(a-b))
                ||( Math.abs(c-a)==Math.abs(b-c)));
    }


}

