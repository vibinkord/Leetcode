class Solution {
    public int maxDistance(int[] colors) {
        int diff=0;
        int i=0,j=colors.length-1;
        while(i<j){
                if(colors[i]!=colors[j]){
                    diff=Math.max(diff,Math.abs(i-j));
                    break;
                }
                j--;
            
        }
        return diff;   
    }
}