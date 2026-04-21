class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
     int max=0;
     int i=0,j=0;
     while(i<nums1.length && j<nums2.length){
     if(i<=j&&nums1[i]<=nums2[j]){
        max=Math.max(j-i,max);
        j+=1;
     }
     else if(i>j){
        j=i;
     }   
     else{
        i+=1;
     }
     }
     return max;

    }
}