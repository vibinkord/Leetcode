class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int x:nums) sum+=x;
        
        int mis=nums.length*(nums.length+1)/2;
        return mis-sum;
        
    }
}