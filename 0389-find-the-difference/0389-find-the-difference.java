class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char i:t.toCharArray()) res^=i;
        for(char i:s.toCharArray()) res^=i;
        return res;
    }
}