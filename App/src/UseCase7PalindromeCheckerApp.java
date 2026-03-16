import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}