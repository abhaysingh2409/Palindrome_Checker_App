import java.util.*;

public  class PalindromeCheckerApp {
    public static Boolean PalindromeChecker(String str) {
        int i = 0;
        int j = str.length() - 1;

        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            j--;
        }
        return true;
    }

    public static Boolean PalindromeChecker2(String str) {
        String reversedText = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedText = reversedText + str.charAt(i);
        }
        if (str.equals(reversedText)) {
            return true;
        } else {
            return false;
        }

    }

    public static Boolean PalindromeChecker3(String str1) {

        char[] str = str1.toCharArray();

        int start = 0;
        int end = str.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str[start] != str[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            return true;
        } else {
            return false;
        }


    }

    public static Boolean PalindromeChecker4(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;

    }

    public static Boolean PalindromeChecker5(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
        }

        return true;
    }


    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text :");
        String str = sc.nextLine();

        System.out.println(PalindromeChecker(str));
        System.out.println("Compare original and reversed\n");
        System.out.println(PalindromeChecker2(str));
        System.out.println("\n");
        System.out.println(PalindromeChecker3(str));
        System.out.println("\n");
        System.out.println(PalindromeChecker4(str));
        System.out.println("\n");
        System.out.println(PalindromeChecker5(str));

        sc.close();


    }
}
