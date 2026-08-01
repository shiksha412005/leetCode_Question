class Solution {
    public int firstPos(int[] nums ,int s,  int e , int target){
      
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                ans = mid;
                 e = mid - 1;   
            }  
            else if(nums[mid] < target){
                s = mid+1;
            }else{
                e =  mid-1;
            }
                  
        }
        return ans;

    }
    public int lastPos(int[] nums , int s , int e , int target){
       
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                ans = mid;
                s = mid + 1;
            }  
            else if(nums[mid] < target){
                s = mid+1;
            }else{
                e =  mid-1;
            } 
                   
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int[] ans = new int[2];
      
       
        ans[0]=firstPos(nums,s, e, target);
        ans[1]=lastPos(nums, s , e , target);
           
        return ans;
    }
}