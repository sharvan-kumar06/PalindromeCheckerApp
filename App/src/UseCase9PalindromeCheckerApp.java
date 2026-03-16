import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Is Palindrome: true");
        } else {
            System.out.println("Is Palindrome: false");
        }

        sc.close();
    }

    // Recursive function
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters mismatch
        if (s.charAt(start) != s.charAt(end))
            return false;

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}