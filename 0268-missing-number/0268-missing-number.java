class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = n * ( n + 1 );
        int newSum = s / 2;
        int nSum = 0;
        for(int i : nums){
            nSum += i;
        }
        int miss = newSum - nSum;
        return miss;
    }
}