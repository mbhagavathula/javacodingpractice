import java.io.*;
import java.util.*;

public class ReverseStringSolution {
    public static String reverseString(String a) {
        String reverse = "";
        for(int i = a.length() - 1; i >= 0; i--)
        {
            reverse = reverse + a.charAt(i);
        }
        return reverse;
    }
    public static String isPalindrome(String a) {
        if (a.compareTo(reverseString(a)) == 0 )
            return "Yes";
        else
            return "No";
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A));
        
    }
}
