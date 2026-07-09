class Solution {
    public int subsetXORSum(int[] nums) {
        return func(nums,0,0);
    }
    int func(int nums[],int idx,int curr){
        if(idx==nums.length) return curr;
        int currelement=func(nums,idx+1,curr^nums[idx]);
        int without=func(nums,idx+1,curr);
        return currelement+without;
    }
}