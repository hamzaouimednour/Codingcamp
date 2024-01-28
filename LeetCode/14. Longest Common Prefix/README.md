# 14. Longest Common Prefix
<div><p>Write a function to find the longest common prefix string amongst an array of strings.</p>

<p>If there is no common prefix, return an empty string <code>""</code>.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> strs = ["flower","flow","flight"]
<strong>Output:</strong> "fl"
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> strs = ["dog","racecar","car"]
<strong>Output:</strong> ""
<strong>Explanation:</strong> There is no common prefix among the input strings.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= strs.length &lt;= 200</code></li>
	<li><code>0 &lt;= strs[i].length &lt;= 200</code></li>
	<li><code>strs[i]</code> consists of only lowercase English letters.</li>
</ul>
<p>&nbsp;</p>
</div>

# Code

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder prefix = new StringBuilder();
        
        for (int i = 0; i < strs[0].length(); i++) {
            for (int s = 1; s < strs.length; s++) {
                if (i > strs[s].length()-1 || strs[s].charAt(i) != strs[0].charAt(i)){
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i));
        }
        
        return prefix.toString();
    }
}
```
