/*
Palindrome checker program using character array and for loop, no string reverse functions used!
 */

public class palindromeFinder {
    private static boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        char[] revch = new char[ch.length];
        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            revch[count] = ch[i];
            count++;
        }
        String revs = new String(revch);
        return s.equals(revs);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java palindromeFinder <string>");
        } else {
            String str = args[0];
            if (isPalindrome(str))
                System.out.println("String is palindrome!");
            else
                System.out.println("String is not palindrome!");
        }
    }
}