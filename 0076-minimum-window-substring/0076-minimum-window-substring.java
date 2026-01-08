class Solution {
    public String minWindow(String s, String t) {
        int left=0;int right=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        if(s.length()<t.length())  return "";
        Map<Character,Integer> m=new HashMap<>(); 

        for(char ch:t.toCharArray()) m.put(ch,m.getOrDefault(ch,0)+1);
        int req=m.size();
        
        while(right<s.length()){
            char c=s.charAt(right);
            if(m.containsKey(c)){
                m.put(c,m.get(c)-1);
                if(m.get(c)==0){
                    req--;
                }
            }
            while(req==0){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }
                char leftc=s.charAt(left);
                if(m.containsKey(leftc)){
                    m.put(leftc,m.get(leftc)+1);
                    if(m.get(leftc)>0){
                        req++;
                    }
                }
                left++;
            }
            right++;
        }
        return min==Integer.MAX_VALUE ? "":s.substring(start,start+min);
        


    }
}