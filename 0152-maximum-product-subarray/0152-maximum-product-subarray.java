class Solution {
    public int maxProduct(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int temp=Math.max(curr*max,curr*min);
            min=Math.min(curr*max,curr*min);
            max= temp;
            res=Math.max(res,max);
        }
        return res;

    }
}