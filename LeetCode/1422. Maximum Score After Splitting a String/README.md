# 1422. Maximum Score After Splitting a String
<div><p>Given a&nbsp;string <code>s</code>&nbsp;of zeros and ones, <em>return the maximum score after splitting the string into two <strong>non-empty</strong> substrings</em> (i.e. <strong>left</strong> substring and <strong>right</strong> substring).</p>

<p>The score after splitting a string is the number of <strong>zeros</strong> in the <strong>left</strong> substring plus the number of <strong>ones</strong> in the <strong>right</strong> substring.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> s = "011101"
<strong>Output:</strong> 5 
<strong>Explanation:</strong> 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> s = "00111"
<strong>Output:</strong> 5
<strong>Explanation:</strong> When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> s = "1111"
<strong>Output:</strong> 3
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 500</code></li>
	<li>The string <code>s</code> consists of characters <code>'0'</code> and <code>'1'</code> only.</li>
</ul>
<p>&nbsp;</p>
</div>

# Code

```java
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
```