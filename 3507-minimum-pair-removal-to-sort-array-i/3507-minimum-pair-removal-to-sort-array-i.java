class Solution {
    public boolean Nondec(List<Integer> lt){
        for(int i=1;i<lt.size();i++){
            if(lt.get(i)<lt.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> lt=new ArrayList<>();
        for(int c:nums){
            lt.add(c);
        }
        int oper=0;
        while(!Nondec(lt)){
            int minsum=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<lt.size()-1;i++){
                int sum=lt.get(i)+lt.get(i+1);
                if(sum<minsum){
                minsum=sum;
                idx=i;
                }
            }
                lt.remove(idx+1);
                lt.set(idx,minsum);
            oper++;
        }
        return oper;
    }
}