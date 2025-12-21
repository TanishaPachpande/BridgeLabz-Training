public class EmployeeBonusCalculator {

    // Generate salary and years of service randomly
    static int[][] generateEmployeeData() {

        int[][] data = new int[10][2]; // [salary][years of service]

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 10) + 1;       // 1–10 years service
        }
        return data;
    }

    // Calculate bonus and new salary
    static double[][] calculateBonus(int[][] data) {

        double[][] result = new double[10][2]; // [newSalary][bonus]

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus;
            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = salary + bonus; // new salary
            result[i][1] = bonus;
        }
        return result;
    }

    // Calculate totals and display
    static void displaySummary(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < 10; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n",
                    (i + 1), oldData[i][0], oldData[i][1],
                    newData[i][1], newData[i][0]);
        }

	// Display the result
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {

	// Create a 2D array
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonus(employeeData);
        displaySummary(employeeData, updatedData);
    }
}
