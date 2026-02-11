class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> lt=new ArrayList<>(map.keySet());
        Collections.sort(lt,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(char ch:lt){
            int freq=map.get(ch);
            while(freq-->0){
                sb.append(ch);
            }

        }   
return sb.toString();
    }
}