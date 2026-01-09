class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        System.out.print(sum);
        int nsum=0;
        for(int n:nums){
            // int s=0;
            while (n > 0) {
                int digit = n % 10;  
                nsum+=digit;
                n = n / 10;
         }
        //  nsum+=s;
        }
        System.out.print(nsum);
        return sum-nsum;
    }
}