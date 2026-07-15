class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, path, used);
        return ans;
    }
    private void dfs(int[] nums, List<Integer> path, boolean[] used) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            path.add(nums[i]);
            dfs(nums, path, used);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}