class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0, maxIndex = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] < nums[minIndex]) minIndex = i;
            if(nums[i] > nums[maxIndex]) maxIndex = i;
        }

        int left = Math.min(minIndex, maxIndex);//1
        int right = Math.max(minIndex, maxIndex);//5

        // Remove both from the front
        int front = right + 1;//6

        // Remove both from the back
        int back = n - left;//7

        // Remove one from each side
        int frontBack = (left + 1) + (n - right);

        return Math.min(front, Math.min(back, frontBack));
    }
}
