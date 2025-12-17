public class FindAveragePercentMark{
  public static void main(String[] args){

      // Taking the marks of all subjects as input.
      int marksInMaths = 94;
      int marksInPhysics = 95;
      int marksInChemistry = 96;

      // Calculating average percent mark.
      int averagePercentMark = (marksInMaths + marksInPhysics + marksInChemistry)/3;

      // Display the result.
      System.out.println("Sam's average mark in PCM is " + averagePercentMark);
  }
}