import java.util.*;

public  class PalindromeCheckerApp{
    public static Boolean PalindromeChecker(String str){
        int i = 0;
        int j = str.length()-1;

        for (i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(j))
                return false;
            j--;
        }
        return true;
    }


    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text :");
        String str =sc.nextLine();

        System.out.println(PalindromeChecker(str));
        sc.close();


    }
}