class Solution {
    // StringBuilder sb=new StringBuilder();
     ArrayList<String> lst=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        dfs(n,sb,0,0);
        return lst;
    }
    void dfs(int n,StringBuilder path,int open ,int close){
        if(n==close){
             lst.add(path.toString());
             return;
        }
        if(open<n){
            path.append('(');
            dfs(n,path,open+1,close);
            path.deleteCharAt(path.length()-1);
        }
        if(open>close){
            path.append(')');
            dfs(n,path,open,close+1);
            path.deleteCharAt(path.length()-1);
        }
    }

}