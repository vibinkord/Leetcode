class Solution {
    public String mostCommonWord(String p, String[] banned) {
        Map<String,Integer> map=new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
          String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        for(String ps:words){
            if(!ban.contains(ps)){
                map.put(ps,map.getOrDefault(ps,0)+1);
            }
        }
        String ans = "";
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}