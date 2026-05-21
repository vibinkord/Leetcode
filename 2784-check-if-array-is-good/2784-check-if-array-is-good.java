class Solution {
    public boolean isGood(int[] nums) {
     int n=nums.length-1;
     Set<Integer> set=new HashSet<>();
    boolean f=false;
    
    for(int num:nums){
        if(num>n) return false;
        if(set.contains(num)){
            if(num<n||f) return false;
            f=true;
            continue;
        }
        set.add(num);
    }
    return true;

    }
}