class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        List<Integer> se = new ArrayList<>();
        
        for(int i = 0; i < num1.length; i++){
            se.add(num1[i]);
        }
        for(int i = 0; i < num2.length; i++){
            se.add(num2[i]);
        }

        int[] arr = new int[se.size()];
        
        for(int i = 0; i < se.size(); i++){
            arr[i] = se.get(i);
        }

        Arrays.sort(arr);

        if(arr.length % 2 != 0){
            return arr[arr.length / 2];
        } else {
            int mid = arr.length / 2 - 1;
            return (arr[mid] + arr[mid + 1]) / 2.0;
        }
    }
}
