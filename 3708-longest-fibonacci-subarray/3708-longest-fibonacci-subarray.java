class Solution {
    public int longestSubarray(int[] nums) {
        int count=2,c=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]+nums[i-2]==nums[i]){
                count++;
            }
            else{
            count=2;
            }
            c=Math.max(count,c);
        }
        return c;

    }
}