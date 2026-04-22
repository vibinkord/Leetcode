class Solution {
    public int maxDistance(int[] colors) {
        int diff=0;
        // if(colors.length==2) return 1;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    diff=Math.max(diff,Math.abs(i-j));
                }
            }

        }
        return diff;   
    }
}