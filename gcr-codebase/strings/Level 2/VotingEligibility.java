public class VotingEligibility {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90) + 10;
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] arr = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);
            arr[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return arr;
    }

    // Displaying result
    static void display(String[][] arr) {
        System.out.println("Age\tCan Vote");
        for (String[] r : arr)
            System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {

        // Calling function to check eligibility
        display(checkVoting(generateAges(10)));
    }
}
