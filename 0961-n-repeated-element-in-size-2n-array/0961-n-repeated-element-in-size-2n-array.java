class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int val=0;
        for(Map.Entry<Integer,Integer>em:mp.entrySet()){
            if(em.getValue()>1) val= em.getKey();
        }
        return val;

    }
}