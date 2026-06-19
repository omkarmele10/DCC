class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0; // initial altitude is 0
        
        int altitude = 0;
        for(int a: gain ){
            altitude += a;
            max = Math.max(altitude,max);
        }

        return max;
    }
}
