import java.util.Scanner;

public class java_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        int result = sum(start, end);
        System.out.println("The sum of numbers from " + start + " to " + end + " is " + result);
        
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        }
        else {
            return end;
        }
    }
}