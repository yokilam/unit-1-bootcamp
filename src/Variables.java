/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {

    System.out.println(isOdd(6));
    printHellowWorld();
    System.out.println(greatestCommonFactor(6,3));
  }

  //2
  public static boolean isOdd(int n) {
    return n % 2 != 0;
  }

  //3
  public static void printHellowWorld(){
    System.out.println("Hello, World!");
  }

  //4
  public static int greatestCommonFactor(int a, int b) {
    if(a == 0 || b == 0) return a+b; // base case
    return greatestCommonFactor(b,a%b);
  }

}
