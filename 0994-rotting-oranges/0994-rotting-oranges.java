class Solution {
   
    public int orangesRotting(int[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ;j++){
                if(grid[i][j] == 2){
                    vis[i][j] = true;
                    q.add(new int[]{i , j , 0});
                }
            }
        }
        int ans = 0;
        while(!q.isEmpty()){
            int[] curr = q.remove(); 
            int i = curr[0];
            int j = curr[1];
            int time = curr[2];
            ans = Math.max(ans , time);
           if(i-1 >= 0 && !vis[i-1][j] && grid[i-1][j] == 1){
             vis[i-1][j] = true;
             q.add(new int[]{i-1 , j , time+1});
           }
           if(i+1 < grid.length && !vis[i+1][j] && grid[i+1][j] == 1){
             vis[i+1][j] = true;
             q.add(new int[]{i+1 , j , time+1});
           }
           if(j-1 >= 0 && !vis[i][j-1] && grid[i][j-1] == 1){
             vis[i][j-1] = true;
             q.add(new int[]{i , j-1 , time+1});
           }
           if(j+1 < grid[0].length && !vis[i][j+1] && grid[i][j+1] == 1){
             vis[i][j+1] = true;
             q.add(new int[]{i , j+1 , time+1});
           }
        }
          for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ;j++){

                if(grid[i][j] == 1 && !vis[i][j]){
                    return -1;
                }
            }
            }
        return ans;
    }
}