class Solution {
     
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1 ) return;
     k = k % nums.length;
      int m = nums.length - k;
      int temp[] = new int[k];
      int j = 0;
      for(int i = m ; i < nums.length ; i++){
        temp[j++] = nums[i];
      }
      
      //shift all to right
      for(int i = m-1 ; i >= 0 ; i--){
        nums[i+k] = nums[i];
      }
   
      for(int i = 0 ; i < k ; i++){
        nums[i] = temp[i];
      }
     
    }
}