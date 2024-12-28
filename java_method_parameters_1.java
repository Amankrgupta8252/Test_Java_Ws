import java.util.Scanner;

public class java_method_parameters_1 {
    public static void checkAge(int age) {
        if (age < 18){
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ages you want to check: ");
         int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);
        }
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // checkAge(age);
        // checkAge(17);
        // checkAge(25);
    }
}
