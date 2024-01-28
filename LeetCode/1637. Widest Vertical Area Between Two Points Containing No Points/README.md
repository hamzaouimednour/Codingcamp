# 1637. Widest Vertical Area Between Two Points Containing No Points
<div><p>Given <code>n</code> <code>points</code> on a 2D plane where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>, Return<em>&nbsp;the <strong>widest vertical area</strong> between two points such that no points are inside the area.</em></p>

<p>A <strong>vertical area</strong> is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The <strong>widest vertical area</strong> is the one with the maximum width.</p>

<p>Note that points <strong>on the edge</strong> of a vertical area <strong>are not</strong> considered included in the area.</p>

<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/19/points3.png" style="width: 276px; height: 371px;">&ZeroWidthSpace;
<pre><strong>Input:</strong> points = [[8,7],[9,9],[7,4],[9,7]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> Both the red and the blue area are optimal.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
<strong>Output:</strong> 3
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == points.length</code></li>
	<li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>points[i].length == 2</code></li>
	<li><code>0 &lt;= x<sub>i</sub>, y<sub>i</sub>&nbsp;&lt;= 10<sup>9</sup></code></li>
</ul>
<p>&nbsp;</p>
</div>

# Code

```java
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // Sorting the rows based on the first element of each row
        Arrays.sort(points, (r1, r2) -> Integer.compare(r1[0], r2[0]));

     
        int WVA = 0;
        for (int i=1; i<points.length; i++) {
            int width = points[i][0] - points[i-1][0];
            WVA = Math.max(WVA, width);
        }
        return WVA;
    }
}
```