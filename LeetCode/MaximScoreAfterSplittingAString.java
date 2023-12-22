class Solution {
    public int maxScore(String s) {
        int max = 0;
        int zeros = 0;

        if(s.indexOf('0') == -1 || s.indexOf('1') == -1){
            return s.length()-1;
        }else{
            for(int left = 0; left < s.length() - 1; left++){
                int ones = 0;
                if (s.charAt(left) == '0') {
                    zeros++;
                }
                for(int right = left+1; right < s.length(); right++){
                    if (s.charAt(right) == '1') {
                        ones++;
                    }
                }
    
                max = Math.max(max, zeros + ones);
            }
        }
        return max;
    }
}
