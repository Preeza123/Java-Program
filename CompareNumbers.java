import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Compare and print the bigger number
        if (num1 > num2) {
            System.out.println(num1 + " is bigger.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is bigger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        
        sc.close();
    }
}
