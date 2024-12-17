import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();

        boolean isArmstrong = isArmstrong(num);
        System.out.println(num + " is " + (isArmstrong ? "an Armstrong Number" : "not an Armstrong Number"));

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, n = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return sum == original;
    }
}
