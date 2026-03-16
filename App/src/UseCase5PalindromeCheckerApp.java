import java.util.Stack;

/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * Use Case 5: Stack-Based Palindrome Checker
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}