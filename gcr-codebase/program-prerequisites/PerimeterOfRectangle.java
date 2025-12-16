import java.util.Scanner;
public class PerimeterOfRectangle{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter length and breadth");
     int length=sc.nextInt();
     int breadth=sc.nextInt();
     System.out.println("Perimeter of rectangle: "+ findPeri(length, breadth));
  }
  public static int findPeri(int length, int breadth){
      return 2*(length+breadth);
  }
}