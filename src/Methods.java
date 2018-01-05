/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

  }

  //1
  public int calculateSquare(int num) {
    return num * num;
  }

  //2 Math.sqrt(a) returns a double, cast int to return int.
  public int calculateSquareRoot(int a) {
    return (int) Math.sqrt(a);
  }

  //3
  public String toLowerCase(String a){
    return a.toLowerCase();
  }

  //4
  public boolean isMultiple(int a, int b){
    return b%a==0;
  }

  //5
  public void prettyInteger(int n){
    String start= "";
    String end = "";
    for (int i = 0; i < n; i++) {
      start = new StringBuilder(start).insert(0, "*").toString();
      end= new StringBuilder(end).insert(0, "*").toString();
    }
    System.out.println(start + n + end);
  }

  //6
  public int random(int a, int b){
    Random rand= new Random();
    return rand.nextInt(b) + a;
  }

}
