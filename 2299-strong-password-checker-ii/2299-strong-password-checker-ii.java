class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lower=false,upper=false,spl=false,digit=false;
        if(password.length()<8) return false;
        String s="!@#$%^&*()-+";
        for(char ch:password.toCharArray()){
            if(ch >='0'&& ch<='9'){
                digit=true;
            }
            else if(ch>='A'&&ch<='Z'){
                upper=true;
            }
            else if(ch>='a'&&ch<='z'){
                lower=true;
            }
            else if(s.contains(String.valueOf(ch))){
                spl=true;
            }

        }
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i+1)) return false;
        }
        if(digit&&upper&&lower&&spl) return true;
        
        return false;
    }
}