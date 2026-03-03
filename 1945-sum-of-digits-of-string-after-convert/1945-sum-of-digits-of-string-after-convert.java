class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        int i=0;
        for(char ch:s.toCharArray()){
            int n=(int)ch-96;
            while(n>0){
                int ne=n%10;
                sum+=ne;
                n/=10;
            }
            // sum+=n;
        }
        int value=issum(sum,k);
        return value;
    }
    static int issum(int sum,int k){
       while(k>1){
        int su=0;
         while(sum>0){
            int n=sum%10;
            su+=n;
            sum/=10;
         } 
         sum=su;
         k--;
       
       }
       return sum;
}
}