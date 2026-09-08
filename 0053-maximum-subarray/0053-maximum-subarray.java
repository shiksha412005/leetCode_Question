class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxS = Integer.MIN_VALUE;
        for(int i = 0 ; i <  nums.length ; i++){
            sum += nums[i];
             maxS = Math.max(maxS , sum);
            if(sum < 0){
                sum = 0;
            }
           
           
        }
        return maxS;
    }}