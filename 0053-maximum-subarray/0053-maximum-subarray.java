class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int val=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>val) val=sum;
            if(sum<0) sum=0;
        }
        return val;
    }
}