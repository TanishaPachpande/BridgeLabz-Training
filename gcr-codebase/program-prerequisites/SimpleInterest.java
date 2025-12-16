import java.util.Scanner;
public class SimpleInterest{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int p=sc.nextInt();
     int r=sc.nextInt();
     int t=sc.nextInt();
     System.out.println("SI: "+ findSimpleInterest(p, r, t));
  }
  public static double findSimpleInterest(int p, int r, int t){
     double ans=(p*r*t)/100;
     return ans;
  }
}