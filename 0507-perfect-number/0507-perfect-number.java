class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=num;
        List<Integer> lt=new ArrayList<>();
		for(int i=1;i*i<=n;i++){
			if(n%i==0){
				lt.add(i);
				if(n/i!=i) lt.add(n/i);
			}
		}
        int sum=0;
		for(int x:lt){
            if(x!=num)
            sum+=x;
        } 
        return sum==num;
		// System.out.println(lt);
    }
}