class Solution {
    public int lengthOfLongestSubstring(String s) {
    //   Set<Character> se=new HashSet<>();
    //   int left=0,right=0,maxlen=0;
    //   while(right<s.length()){
    //     char ch=s.charAt(right);
    //     if(!se.contains(ch)){
    //         se.add(ch);
    //         right++;
    //         maxlen=Math.max(maxlen,se.size());
    //     }
    //     else{
    //         se.remove(s.charAt(left));
    //         left++;

    //     }
    //   }
    int last[]=new int[256];
    Arrays.fill(last,-1);
    int left=0,maxlen=0;
    for(int right=0;right<s.length();right++){
        char c=s.charAt(right);
        if(last[c]>=left) left=last[c]+1;
        last[c]=right;
        maxlen=Math.max(maxlen,right-left+1);
    }
      return maxlen;
    }
}