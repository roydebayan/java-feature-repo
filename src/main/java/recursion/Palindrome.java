package recursion;

public class Palindrome {
    public boolean isPalindrome(String string){
        if (string.isEmpty() || string.length() == 1) return true;
        if (string.charAt(0) != string.charAt(string.length() - 1)) return false;
        return isPalindrome(string.substring(1, string.length() - 1));
    }

    public static void main(String[] args) {
        String string = "kandydidak";
        Palindrome palindrome = new Palindrome();
        boolean palindrome1 = palindrome.isPalindrome(string);
        System.out.println("result = " + palindrome1);
    }
}
