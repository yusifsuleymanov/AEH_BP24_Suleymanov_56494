package pl.pp;

public class myTenthApp {

    /**
     * This method returns an array containing:
     * - the number of negative integers
     * - the sum of positive integers
     * <p>
     * If the input array is null or empty, it returns an empty array.
     *
     * @param input an array of integers
     * @return int[] {number of negative elements, sum of positive elements}
     */
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int number : input) {
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveSum += number;
            }
        }

        return new int[] { negativeCount, positiveSum };
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);

        if (result.length > 0) {
            System.out.println("Negative count: " + result[0]);
            System.out.println("Positive sum: " + result[1]);
        } else {
            System.out.println("Empty or null array.");
        }
    }
}

// Author: Your Name
