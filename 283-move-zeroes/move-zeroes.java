class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
        }
        for(int j = i; j< arr.length; j++){
            arr[j] = 0;
        }
        
    }
}