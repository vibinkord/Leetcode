class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length==2&&nums[0]!=nums[1]){
        List<Integer> list = new ArrayList<>();
        for(int num:nums) list.add(num);
        return list;
        }
        int candidate = 0;
        int count = 0;
        // List<Integer> lt = new ArrayList<>();
        Set<Integer> se=new HashSet<>();

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
            se.add(candidate);
        }
        List<Integer> list = new ArrayList<>(se);


        return list;
    }
}