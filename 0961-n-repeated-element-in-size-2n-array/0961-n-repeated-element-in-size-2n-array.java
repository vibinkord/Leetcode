class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
            if(mp.get(n)>1){
                return n;
            }
        }
        // int val=0;
        // for(Map.Entry<Integer,Integer>em:mp.entrySet()){
        //     if(em.getValue()>1) {
        //         val= em.getKey();
        //         break;
        //     }
        // }
        return -1;

    }
}