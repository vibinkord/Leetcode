class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int vo=0;
        int co=0;
        for(Map.Entry<Character,Integer> em:m.entrySet()){
             char c = Character.toLowerCase(em.getKey());
            int freq = em.getValue();

            if ("aeiou".indexOf(c) != -1) {
                vo = Math.max(vo, freq);
            } else {
                co = Math.max(co, freq);
            }
        }
        return vo+co;
    }
}