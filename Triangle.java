// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0)
            return 0;
        int n = triangle.size();

        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                triangle.get(i).set(j, Math.min(triangle.get(i).get(j) + triangle.get(i+1).get(j), triangle.get(i).get(j) + triangle.get(i+1).get(j+1)));
            }
        }

        return triangle.get(0).get(0);
    }
}