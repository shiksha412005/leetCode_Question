class Solution {
    public void moveZeroes(int[] nums) {
      int i = 0;
      int j = 0;
      for(j = 0 ; j < nums.length ; j++){
        while(i < nums.length && nums[i] != 0){
            i++;
        }
        if(i < j && i < nums.length && nums[j] != 0){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
        }
      }
    }
}