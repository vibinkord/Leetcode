class Solution {
    public int largestAltitude(int[] gain) {
        int g=0;
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        for(int i = 0; i < gain.length; i++) {
        arr[i + 1] = arr[i] + gain[i];
    }
        Arrays.sort(arr);
        for(int num:arr) System.out.println(num);
        return arr[arr.length-1];
        
    }
}