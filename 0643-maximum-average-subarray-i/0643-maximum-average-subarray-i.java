class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int maxs=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(right>=k-1){
                maxs=Math.max(maxs,sum);
                sum-=nums[right-k+1];
            }
        }
        return (double)maxs/k;
    }
}