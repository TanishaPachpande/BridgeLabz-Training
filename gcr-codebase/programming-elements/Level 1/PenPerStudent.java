public class PenPerStudent{
 public static void main(String[] args){

    // Taking the number of pens and students as input.
    int numberOfPens= 14;
    int numberOfStudents= 3;

    // Calculating the pen per student and the remaining non-distributed pens.
    int penPerStudent= numberOfPens/numberOfStudents;
    int remainingPens = numberOfPens%numberOfStudents;

    // Display the result.
    System.out.println("The Pen Per Student is "+ penPerStudent+" and the remaining pen not distributed is "+ remainingPens);
 }
}