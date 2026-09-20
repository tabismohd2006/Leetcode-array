class Solution {

    public static int longestConsecutive(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int count = 1;
        int max = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                count++;

            } else if (arr[i] == arr[i - 1]) {
               

            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
