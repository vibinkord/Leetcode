class Solution {
    public int maxNumberOfBalloons(String text) {
        char arr[]=text.toCharArray();
        int ans=0;
        while(true){
            String word="balloon";
            for(char c:word.toCharArray()){
                boolean f=false;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==c){
                        arr[i]='#';
                        f=true;
                        break;
                    }
                }
                if(!f) return ans;
            }
            ans++;
        }  
    }
}