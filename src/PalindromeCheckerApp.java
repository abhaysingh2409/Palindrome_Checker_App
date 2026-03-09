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

    public static Boolean PalindromeChecker6(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
    public static Boolean PalindromeChecker7(String str) {
        LinkedList<Character> list = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> forward = list.listIterator();
        ListIterator<Character> backward = list.listIterator(list.size());

        while (forward.nextIndex() < backward.previousIndex()) {
            if (!forward.next().equals(backward.previous())) {
                return false;
            }
        }
        return true;
    }


    public static boolean PalindromeChecker8(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return  PalindromeChecker8(str,start + 1, end - 1);
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
        System.out.println("\n");
        System.out.println(PalindromeChecker6(str));
        System.out.println("\n");
        System.out.println(PalindromeChecker7(str));
        System.out.println("\n recursive");
        System.out.println(PalindromeChecker8(str, 0, str.length() - 1));
        sc.close();


    }
}
