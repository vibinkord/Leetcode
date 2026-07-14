class Solution {
    List<List<Integer>> lst=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int tar) {
        List<Integer> path=new ArrayList<>();
        dfs(nums,tar,path,0);
        return lst;

    }
    void dfs(int nums[],int tar,List<Integer> path,int idx){
        if(tar==0){
            lst.add(new ArrayList<>(path));
            return;
        }
        if(idx>nums.length-1) return;
        if(tar<0) return;

        path.add(nums[idx]);

        dfs(nums,tar-nums[idx],path,idx);

        path.remove(path.size()-1);

        dfs(nums,tar,path,idx+1);

    }
}