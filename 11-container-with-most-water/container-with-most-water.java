class Solution {
    public int maxArea(int[] arr) {
        int maxWater= 0;
        int i =0; int j = arr.length-1;
        while(i<j){
            int width = j-i;
            int height = Math.min(arr[i], arr[j]);
            int currWater = width*height;
            maxWater = Math.max(maxWater, currWater);
            if(arr[i]< arr[j]){
                i++;
            } else {
                j--;
            }
        }
        return maxWater;

        
    }
}