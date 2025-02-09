import java.util.Scanner;

public class MultipleOf27Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a multiple of 27
        if (number % 27 == 0) {
            System.out.println(number + " is a multiple of 27.");
        } else {
            System.out.println(number + " is not a multiple of 27.");
        }
        
        scanner.close();
    }
}
