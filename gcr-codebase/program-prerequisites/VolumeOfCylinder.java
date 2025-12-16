import java.util.Scanner;
public class VolumeOfCylinder{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Radius:");
       double r=sc.nextDouble();
       System.out.println("Enter Height:");
       double h=sc.nextDouble();
       System.out.println("Volume of Cylinder is "+ findVolume(r,h));
   }
   public static double findVolume(double r, double h){
        double vol = 3.14*r*r*h;
        return vol;
   }
}