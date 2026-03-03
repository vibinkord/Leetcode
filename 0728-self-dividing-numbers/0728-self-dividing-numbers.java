class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> lst=new ArrayList<>();
        for(int i=left;i<=right;i++){
            // if(i<10) lst.add(i);
            // else{
                int aa=i;
                boolean f= true;
                while(aa>0){
                    int n=aa%10;
                    if(n==0||i % n!=0) f=false;
                    aa/=10;
                }

                if(f)lst.add(i);
            // }
        }
        return lst;
    }
}