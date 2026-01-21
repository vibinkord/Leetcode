
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        // Step 2: Find max k times
        for (int i = 0; i < k; i++) {
            int maxKey = 0;
            int maxVal = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxVal) {
                    maxVal = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            result[i] = maxKey;
            map.remove(maxKey);
        }

        return result;
    }
}
