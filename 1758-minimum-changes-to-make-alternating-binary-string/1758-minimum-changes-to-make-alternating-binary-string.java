class Solution {
    public int minOperations(String s) {
       return Math.min(min(s,"0"),min(s,"1"));
    }

    static int min (String s1,String start){
        String s[]=s1.split("");
        int c=0;

        if(!s[0].equals(start)){
            s[0]=start;
            c++;
        }

        for(int i=0;i<s.length-1;i++){
            if(s[i].equals("0")){
                if(!s[i+1].equals("1")){
                    s[i+1]="1";
                    c++;
                }
            }
            else{
                if(!s[i+1].equals("0")){
                    s[i+1]="0";
                    c++;
                }
            }
        }
        return c;
    }
}