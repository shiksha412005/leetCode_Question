class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxZero = 0;
        int z = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 1){
                maxZero = Math.max(maxZero , z);
                z = 0;
                continue;
            }
            z++;
        }
        return   Math.max(maxZero , z);
    }
}