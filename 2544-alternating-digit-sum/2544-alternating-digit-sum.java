class Solution {
    public int alternateDigitSum(int n) {
        String str = Integer.toString(n);
        char ch[]=str.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                sum+=  ch[i]-'0';
            }
            else sum-= ch[i]-'0';
        }
        return sum;
    }
}