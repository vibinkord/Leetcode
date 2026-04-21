class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') u++;
            else if(ch=='R') r++;
            if(ch=='L') l++;
            if(ch=='D') d++;

        }
        return r==l&&u==d;
    }
}