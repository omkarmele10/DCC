// TC: O(N^2) // applied brute force since constraint is low

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i<n; i++){
            int cntOfTarget = 0;
            for(int j = i; j<n; j++){
                if(nums[j] == target)cntOfTarget++;
                int other = (j-i+1)-cntOfTarget;
                if(cntOfTarget > other) cnt++;
            }
        }
        return cnt;
    }
}
