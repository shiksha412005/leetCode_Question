class Solution {
    public void reverse(int[] nums , int left , int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }
    public void nextPermutation(int[] nums) {
     int piv = -1;
     for(int i = nums.length-2 ; i >= 0 ; i--){
        if(nums[i] < nums[i+1]){
            piv = i;
            break;
        }
     }   
    if(piv == -1){
        reverse(nums , piv+1 , nums.length-1);
        return;
    }
    //find right most smallest 
    for(int i = nums.length-1 ; i >= 0; i--){
        if(nums[i] > nums[piv]){
            int temp = nums[i];
            nums[i] = nums[piv];
            nums[piv] = temp;
            break;
        }
    }
    reverse(nums ,piv+1 , nums.length-1);
    

    }
}