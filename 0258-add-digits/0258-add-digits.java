class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        else{
            int sum=0;
            while(num>0){
                int n=num%10;
                sum+=n;
                num/=10;
            }
            return (addDigits(sum));
        }
    }
}