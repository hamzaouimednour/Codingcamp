# 2. Add Two Numbers

<div>
<p>You are given two <strong>non-empty</strong> linked lists representing two non-negative integers. The digits are stored in <strong>reverse order</strong>, and each of their nodes contains a single digit. Add the two numbers and return the sum&nbsp;as a linked list.</p>

<p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.</p>

<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" style="width: 483px; height: 342px;">
<pre><strong>Input:</strong> l1 = [2,4,3], l2 = [5,6,4]
<strong>Output:</strong> [7,0,8]
<strong>Explanation:</strong> 342 + 465 = 807.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> l1 = [0], l2 = [0]
<strong>Output:</strong> [0]
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
<strong>Output:</strong> [8,9,9,9,0,0,0,1]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in each linked list is in the range <code>[1, 100]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 9</code></li>
	<li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
</ul>
<p>&nbsp;</p>
</div>

# Code

```java
import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lSum = new ListNode();
        StringBuilder l1Sum = new StringBuilder(""), l2Sum = new StringBuilder("");
        l1Sum.append(l1.val);
        l2Sum.append(l2.val);

        while (l1.next != null) {
            l1 = l1.next;
            l1Sum.append(l1.val);
        }
        while(l2.next != null){
            l2 = l2.next;
            l2Sum.append(l2.val);
        }

        BigInteger l1Big = new BigInteger(l1Sum.reverse().toString());
        BigInteger l2Big = new BigInteger(l2Sum.reverse().toString());
        String res = l1Big.add(l2Big).toString();

        lSum.val = res.charAt(0) - '0';
        for(int i = 1; i < res.length() ; i++){
            lSum = new ListNode(res.charAt(i) - '0', lSum);
        }

        return lSum;
    }
}
```
