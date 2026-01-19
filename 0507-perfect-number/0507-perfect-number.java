class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=num;
        if(num<=1) return false;
        int sum=1;
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
                sum+=i;
				if(n/i!=i) {
                    sum+=n/i;
        	}
		}
        }
		return sum==num;
	}
}