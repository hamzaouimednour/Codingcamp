package LeetCode;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] sC = s.toCharArray();
            char[] sT = s.toCharArray();
            Arrays.sort(sC);
            Arrays.sort(sT);
            for(int i = 0; i < s.length(); i++){
                if(sC[i] != sT[i]) return false;
            }
            return true;
            // return Arrays.equals(sC, sT);
        }
        return false;
    }
}
