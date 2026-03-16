/**
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * Use Case 2: Hardcoded Palindrome Validation
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";   // Hardcoded string
        boolean isPalindrome = true;

        // Check palindrome
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

    }
}