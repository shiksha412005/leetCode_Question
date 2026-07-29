class Solution {
    
    public int numSubarraysWithSum(int[] arr, int goal) {
       int count = 0;
     int[] PS = new int[arr.length];
     PS[0] = arr[0];
     for(int i = 1 ; i < arr.length ; i++){
        PS[i] = PS[i-1] + arr[i];
     }
      Map<Integer , Integer> map = new HashMap<>();
     for(int j = 0 ; j < arr.length ; j++){
        if(PS[j] == goal)count++;

        if(map.containsKey(PS[j] - goal)){
            count += map.get(PS[j]-goal);
        }
        map.put(PS[j] , map.getOrDefault(PS[j] , 0) + 1);
    }
    return count ;
    }
}