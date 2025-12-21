public class RandomArray {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random number between 1000 and 9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = (int) Math.min(min, numbers[i]);
            max = (int) Math.max(max, numbers[i]);
        }

        double average = sum / (double) numbers.length;

        // index 0 → average, 1 → min, 2 → max
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);
    }
}
