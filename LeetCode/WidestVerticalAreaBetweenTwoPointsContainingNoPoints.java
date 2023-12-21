class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // Sorting the rows based on the first element of each row
        Arrays.sort(points, (r1, r2) -> Integer.compare(r1[0], r2[0]));
     
        // Compare each vertical area width
        int WVA = 0;
        for (int i=1; i<points.length; i++) {
            int width = points[i][0] - points[i-1][0];
            if (WVA < width) WVA = width;
        }
        return WVA;
    }
}
