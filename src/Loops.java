/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {

  }

  //1
  public void printsOneThroughTen(){
    for (int i = 1; i <= 10 ; i++) {
      System.out.print(i + " ");
    }
  }

  //2
  public void printsOneThroughTen2(){
    int n = 0;
    while (n <10) {
      n++;
      System.out.print(n + " ");
    }
  }

  //3
  public void printsNumberN(int n){
    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }
  }

  //4
  public void printsEvenNumbers(int n){
    for (int i = 1; i <= n; i++) {
      if (i%2==0){
        System.out.print(i + " ");
      }
    }
  }

  //5
  public void sumOfOneThroughTen(){
    int sum = 0;
    for (int i = 1; i <= 10 ; i++) {
      sum += i;
    }
    System.out.print(sum);
  }

  //6
  public void sum(int n){
    int sum = 0;
    for (int i = 1; i <= n ; i++) {
      sum += i;
    }
    System.out.print(sum);
  }

  //7
  sum(10000);

  //8
  public void printStringNTimes(String s, int n){
    if (n < 0) {
      System.out.println("");
    } else {
      for (int i = 0; i < n ; i++) {
        System.out.println(s);
      }
    }
  }

  //9
  public void printStringConcatenate(String s, int n){
    String newString = "";
    for (int i = 0; i < n; i++) {
      System.out.println(newString += s);
    }
  }

  //10
  public void printFirstTenFibonnaci(){
    int a=0, b=1, c, count=10;
    for (int i = 0; i < count; i++) {
      c= a+b;
      System.out.print(a);
      a=b;
      b=c;
    }
  }

  //11
  public void printSumOfFirstTenFibonnaci() {
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
  public void printSumOfNFibonnaci(int n){
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
