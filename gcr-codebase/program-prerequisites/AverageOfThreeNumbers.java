import java.util.Scanner;
public class AverageOfThreeNumbers{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter three numbers");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     System.out.println("Average of three numbers: "+ findAvg(a,b,c));
  }
  public static double findAvg(int a, int b, int c){
     return (double)(a+b+c)/3;
  }
}