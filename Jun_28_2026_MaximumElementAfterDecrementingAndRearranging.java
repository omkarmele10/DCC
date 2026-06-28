// sorting + greedy approach
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int maxE = 1;// min possible answer

        for(int i =1; i<arr.length; i++){
            int num = arr[i];
            if(num > maxE ){
                maxE = maxE+1;
            }
        }
        return maxE;
    }
}
