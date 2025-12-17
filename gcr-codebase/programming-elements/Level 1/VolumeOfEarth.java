
public class VolumeOfEarth{
  public static void main(String[] args){

      // taking radius in Kms as input.
      int radiusInKms = 6378;

      // converting radius from kms to miles.
      double radiusInMiles = radiusInKms * 0.6;

      // Calculating the volume in Kms and Miles.
      double volumeInKms = (4/3) * 3.14 * Math.pow(radiusInKms, 3);
      double volumeInMiles = (4/3) * 3.14 * Math.pow(radiusInMiles, 3);

      // Display the result.
      System.out.println("The volume of earth in cubic kilometers is "+ volumeInKms +" and cubic miles is "+ volumeInMiles);
  }
}