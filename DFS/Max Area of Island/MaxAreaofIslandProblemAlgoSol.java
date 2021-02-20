//Time Complexity: O(m*n) see txt for more details.
//Space Complexity:O(m*n) see txt for more details

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid.length==0){
            return 0;
        }
        int max=0;
        
        for (int i =0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    max = Math.max(dfs(grid,i,j),max);
                }
            }
        }
        
        return max;
        
    }
    
    public int dfs(int[][] grid, int i, int j) {
        if(i<0 || j<0 || j>grid[0].length-1 || i>grid.length-1 || grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int count=1;
        count += dfs(grid, i+1, j);
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);
        count += dfs(grid, i-1, j);
        System.out.println("returningcount: "+count+" for grid i:"+i+" j:"+j);
        return count;
    }
    
    
}