class Solution {
    public int numberOfSpecialChars(String word) {
           Set<Character> st=new HashSet<>();
           for(char c:word.toCharArray()){
            st.add(c);
           }
           int count=0;
           for(char ch:st){
            char cap=Character.toUpperCase(ch);
            if(Character.isLowerCase(ch) && st.contains(cap)){
                count++;
            }
           }
           return count;
    }
}