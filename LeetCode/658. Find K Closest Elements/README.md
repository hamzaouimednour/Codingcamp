# 658. Find K Closest Elements
<div><p>Given a <strong>sorted</strong> integer array <code>arr</code>, two integers <code>k</code> and <code>x</code>, return the <code>k</code> closest integers to <code>x</code> in the array. The result should also be sorted in ascending order.</p>

<p>An integer <code>a</code> is closer to <code>x</code> than an integer <code>b</code> if:</p>

<ul>
	<li><code>|a - x| &lt; |b - x|</code>, or</li>
	<li><code>|a - x| == |b - x|</code> and <code>a &lt; b</code></li>
</ul>

<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> arr = [1,2,3,4,5], k = 4, x = 3
<strong>Output:</strong> [1,2,3,4]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> arr = [1,2,3,4,5], k = 4, x = -1
<strong>Output:</strong> [1,2,3,4]
</pre>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= k &lt;= arr.length</code></li>
	<li><code>1 &lt;= arr.length &lt;= 10<sup>4</sup></code></li>
	<li><code>arr</code> is sorted in <strong>ascending</strong> order.</li>
	<li><code>-10<sup>4</sup> &lt;= arr[i], x &lt;= 10<sup>4</sup></code></li>
</ul>
<p>&nbsp;</p>
</div>

# Code

```java
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] subArray = new int[arr.length];
        List<Integer> solArray = new ArrayList<Integer>(k);
        for(int i = 0; i < arr.length; i++){
            subArray[i] = Math.abs(x- arr[i]);
        }
        int min = 0;
        int minIndex = 0;
        int minSum = 0;
        while(min<(arr.length - k+1)){
            int tmpSum = 0;
            for(int i=min; i < min+k; i++){
                tmpSum += subArray[i];
            }
            if(min == 0){
                minIndex = min;
                minSum = tmpSum;
            }
            if(minSum > tmpSum){
                minSum = tmpSum;
                minIndex = min;
            }
            min++;
        }
        for(int i = minIndex; i < minIndex+k; i++){
            solArray.add(arr[i]);
        }
        return solArray;

    }
}
```