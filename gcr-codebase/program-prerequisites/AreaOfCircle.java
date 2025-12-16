import java.util.Scanner;
public class AreaOfCircle{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Radius:");
       double r=sc.nextDouble();
       System.out.println("Area of circle is "+ findArea(r));
   }
   public static double findArea(double radius){
        double area= 3.14*radius*radius;
        return area;
   }
}