//Time Complexity: O(n*m*size of largest island)
//Space Complexity:O(1)

class Solution {
    public int numIslands(char[][] grid) {
        int finalCount=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1') {
                    finalCount += dfs(grid,i,j);
                }
            }
        }
        return finalCount;
    }
    
    int dfs(char[][] grid,int i,int j) {
        if ( j<0 || i<0 || i>=grid.length || j>=grid[0].length ||grid[i][j] == '0'){
            return 0;
        }
        grid[i][j]='0';

        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        
        return 1;
    }
}
