class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String s[]=Integer.toBinaryString(n).split("");
        StringBuilder sb=new StringBuilder();
        for(String ss:s){
            if(ss.equals("0")){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        System.out.println(sb.toString());
        return Integer.parseInt(sb.toString(),2);
    }
}