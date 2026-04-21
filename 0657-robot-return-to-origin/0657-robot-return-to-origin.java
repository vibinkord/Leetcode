class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,u=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') u++;
            else if(ch=='R') l--;
            if(ch=='L') l++;
            if(ch=='D') u--;

        }
        return l==0&&u==0;
    }
}