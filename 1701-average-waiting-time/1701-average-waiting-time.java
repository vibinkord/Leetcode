class Solution {
    public double averageWaitingTime(int[][] c) {
        long x=0,t=0;
        for(int i=0;i<c.length;i++){
            int ar=c[i][0];
            int ck=c[i][1];
            if(x<ar)
                x=ar;

                x+=ck;
                t=t+ x-ar;
            
        
        }
            double to=(double)t/c.length;
            return to;
    }
}