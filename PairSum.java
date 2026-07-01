import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println();
                    System.out.println("Pair found!");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        input.close();
    }
}