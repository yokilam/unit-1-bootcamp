import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

    System.out.println(calculateSquareRoot(4));
    System.out.println(toLowerCase("LOnasgGSDAS"));
    System.out.println(isMultiple(5, 101));
    System.out.println(random(4, 6));
    prettyInteger(6);

  }

  //1
  public static int calculateSquare(int num) {
    return num * num;
  }

  //2 Math.sqrt(a) returns a double, cast int to return int.
  public static int calculateSquareRoot(int a) {
    return (int) Math.sqrt(a);
  }

  //3
  public static String toLowerCase(String a){
    return a.toLowerCase();
  }

  //4
  public static boolean isMultiple(int a, int b){
    return b%a==0;
  }

  //5
  public static void prettyInteger(int n){
    String start= "";
    String end = "";
    for (int i = 0; i < n; i++) {
      start = new StringBuilder(start).insert(0, "*").toString();
      end= new StringBuilder(end).insert(0, "*").toString();
    }
    System.out.println(start + n + end);
  }

  //6
  public static int random(int a, int b){
    Random rand= new Random();
    return rand.nextInt(b) + a;
  }

}
