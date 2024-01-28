# 9. Palindrome Number
<div><p>Given an integer <code>x</code>, return <code>true</code><em> if </em><code>x</code><em> is a <strong>palindrome</strong>, and </em><code>false</code><em> otherwise</em>.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> x = 121
<strong>Output:</strong> true
<strong>Explanation:</strong> 121 reads as 121 from left to right and from right to left.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> x = -121
<strong>Output:</strong> false
<strong>Explanation:</strong> From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> x = 10
<strong>Output:</strong> false
<strong>Explanation:</strong> Reads 01 from right to left. Therefore it is not a palindrome.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup>&nbsp;&lt;= x &lt;= 2<sup>31</sup>&nbsp;- 1</code></li>
</ul>

<strong>Follow up:</strong> Could you solve it without converting the integer to a string?
<p>&nbsp;</p>
</div>

# Code

```java
class Solution {
    public boolean isPalindrome(int x) {
        char[] xChars = Integer.toString(x).toCharArray();
        int backward = xChars.length - 1;
        for(int forward = 0; forward < xChars.length /2; forward++) {
            if(xChars[forward] != xChars[backward - forward]) return false;
        }
        return true; 
    }
}
```
