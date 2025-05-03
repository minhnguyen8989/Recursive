import java.util.Scanner;

/**
 * A program that prompts the user to enter five numbers and calculates
 * the product of those numbers using recursion.
 */
public class RecursiveProduct {

    /**
     * The main method that drives the program.
     * It takes input from the user, stores it in an array,
     * and calculates the product using a recursive method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] fiveNumbersInput = new int[5];

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter 5 numbers:");

            for (int i = 0; i < 5; i++) {
                while (true) {
                    System.out.print("Number " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        fiveNumbersInput[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // Clear invalid input
                    }
                }
            }
            scanner.close();

            int product = calculateproduct(fiveNumbersInput, 0);
            System.out.println("The product of the 5 numbers is: " + product);
        }
    }

    /**
     * Recursively calculates the product of all elements in the array
     * starting from a given index.
     *
     * @param nums  the array of integers
     * @param index the current index in the array
     * @return the product of all elements from the current index to the end
     */
    public static int calculateproduct(int[] nums, int index) {
        //Base Case
        if (index == nums.length - 1) {
            return nums[index];
        }
        //Recursive Case
        return nums[index] * calculateproduct(nums, index + 1);
    }
}
