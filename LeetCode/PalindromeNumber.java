package LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] xChars = Integer.toString(x).toCharArray();
        int backward = xChars.length - 1;
        for(int forward = 0; forward < xChars.length /2; forward++) {
            if(xChars[forward] != xChars[backward - forward]) return false;
        }
        return true;
    }
}
