package linecomparision;

import java.util.ArrayList;
import java.util.Scanner;

class Line {
    private double x1, y1, x2, y2;

    // Constructor
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length
    public double calculateLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }
}

public class LineComparisonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Line> lines = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n * 2; i++) {
            System.out.println("Enter coordinates for Line " + i + " (x1 y1 x2 y2):");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            lines.add(new Line(x1, y1, x2, y2));
        }

        for (int i = 0; i < lines.size(); i += 2) {
            double len1 = lines.get(i).calculateLength();
            double len2 = lines.get(i + 1).calculateLength();

            System.out.println("\nComparison Result:");
            if (len1 == len2) {
                System.out.println("Both lines are equal in length");
            } else if (len1 > len2) {
                System.out.println("Line 1 is longer");
            } else {
                System.out.println("Line 2 is longer");
            }
        }
        sc.close();
    }
}

