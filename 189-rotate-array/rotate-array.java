class Solution {

    public static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

      
        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

       
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {

        int i = start;
        int j = end;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}