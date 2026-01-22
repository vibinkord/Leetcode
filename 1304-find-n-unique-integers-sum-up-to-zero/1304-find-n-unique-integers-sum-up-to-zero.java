class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int idx=0;
        int par=n/2;
        for(int i=1;i<=par;i++){
            arr[idx++]=i;
            arr[idx++]=-i;
        }
        if(n%2==1){
            arr[idx++]=0;
        }
        return arr;
    }
}