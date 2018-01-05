/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {

    //7
    sum(10000);

    printsOneThroughTen();
    printsOneThroughTen2();
    printsNumberN(6);
    printsEvenNumbers(10);
    sum(10000);
    printStringNTimes("You", 2);
    printStringConcatenate("Go", 3);
    printFirstTenFibonnaci();
    printSumOfFirstTenFibonnaci();
    printSumOfNFibonnaci(20);

  }

  //1
  public static void printsOneThroughTen(){
    for (int i = 1; i <= 10 ; i++) {
      System.out.print(i + " ");
    }
  }

  //2
  public static void printsOneThroughTen2(){
    int n = 0;
    while (n <10) {
      n++;
      System.out.print(n + " ");
    }
  }

  //3
  public static void printsNumberN(int n){
    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }
  }

  //4
  public static void printsEvenNumbers(int n){
    for (int i = 1; i <= n; i++) {
      if (i%2==0){
        System.out.print(i + " ");
      }
    }
  }

  //5
  public static void sumOfOneThroughTen(){
    int sum = 0;
    for (int i = 1; i <= 10 ; i++) {
      sum += i;
    }
    System.out.print(sum);
  }

  //6
  public static void sum(int n){
    int sum = 0;
    for (int i = 1; i <= n ; i++) {
      sum += i;
    }
    System.out.print(sum);
  }

  //8
  public static void printStringNTimes(String s, int n){
    if (n < 0) {
      System.out.println("");
    } else {
      for (int i = 0; i < n ; i++) {
        System.out.println(s);
      }
    }
  }

  //9
  public static void printStringConcatenate(String s, int n){
    String newString = "";
    for (int i = 0; i < n; i++) {
      System.out.println(newString += s);
    }
  }

  //10
  public static void printFirstTenFibonnaci(){
    int a=0, b=1, c, count=10;
    for (int i = 0; i < count; i++) {
      c= a+b;
      System.out.print(a);
      a=b;
      b=c;
    }
  }

  //11
  public static void printSumOfFirstTenFibonnaci() {
    int a = 0, b = 1, c, sum = 0;
    for (int i = 0; i < 10; i++) {
      c = a + b;
      sum += a;
      a = b;
      b = c;
    }
    System.out.print(sum);
  }

  //12
  public static void printSumOfNFibonnaci(int n){
    int a=0, b=1, c, sum=0;
    for (int i = 0; i < n; i++) {
      c= a+b;
      sum+=a;
      a=b;
      b=c;
    }
    System.out.print(sum);
  }
}
