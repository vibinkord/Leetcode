class Solution {
    List<String> ans=new ArrayList<>();
    String []map={
        "","","abc","def","ghi","kjl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
      if(digits.length()==0){
        return ans;
      }  
      StringBuilder path=new StringBuilder();
      dfs(digits,0,path);
      return ans;
    }
    private void dfs(String digits,int index,StringBuilder path){
        if(index==digits.length()){
            ans.add(path.toString());
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            path.append(letters.charAt(i));
            dfs(digits,index+1,path);
            path.deleteCharAt(path.length()-1);
        }
    }
}