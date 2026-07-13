class Solution {
    List<List<Integer>>lst =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lst1=new ArrayList<>();
        dfs(nums,lst1,0);
        return lst;
    }
    void dfs(int nums[],List<Integer> lst1,int idx){
        if(nums.length==idx){
            lst.add(new ArrayList<>(lst1));
            return;
        }
        lst1.add(nums[idx]);
        dfs(nums,lst1,idx+1);
        lst1.remove(lst1.size()-1);
        dfs(nums,lst1,idx+1);



    }
}