# 3. Longest Substring Without Repeating Characters

<div><p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <strong>substring</strong> without repeating characters.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> s = "abcabcbb"
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is "abc", with the length of 3.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> s = "bbbbb"
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is "b", with the length of 1.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> s = "pwwkew"
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
</ul>
<p>&nbsp;</p>
</div>

# Code

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            int subIndex = s.substring(0, i).lastIndexOf(s.charAt(i));
            if (subIndex != -1 && index <= subIndex) {
                index = subIndex + 1;
            }
            longest = Math.max(s.substring(index, i+1).length(), longest);
        }

        return longest;
    }
}
```
