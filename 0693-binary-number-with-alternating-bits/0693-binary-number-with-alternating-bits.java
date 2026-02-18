class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        char []s1=s.toCharArray();
        for(int i=0;i<s1.length-1;i++){
            if(s1[i]==s1[i+1]) {
                return false;
        }
    }
        return true;
    }
}