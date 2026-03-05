class Solution {
    public List<String> removeAnagrams(String[] words) {

        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(String w : words){

            char[] ch = w.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(set.isEmpty() || !set.contains(sorted)){
                res.add(w);
                set.clear();
                set.add(sorted);
            }
        }

        return res;
    }
}