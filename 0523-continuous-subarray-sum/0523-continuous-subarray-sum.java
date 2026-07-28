class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2)return false;
     int[] PS = new int[nums.length];
     PS[0] = nums[0];
     for(int i = 1 ; i < nums.length ; i++){
        PS[i] = PS[i-1] + nums[i];
     }

     Map<Integer , Integer> map = new HashMap<>();
     map.put(0 , -1);
     for(int j = 0 ; j < nums.length ; j++){

       //if(PS[j] % k == 0)return true;
       if(map.containsKey(PS[j] % k )){
            if( j - map.get(PS[j] % k ) > 1){
                return true;
            }
       }else{
        map.put(PS[j]%k , j);
       }
     }
     return false;
    }
}
