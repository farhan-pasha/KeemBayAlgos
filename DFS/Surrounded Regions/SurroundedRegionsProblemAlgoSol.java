//Time Complexity: O(m*max number of connected '0'(which can be n*m - dfs)...if m > n else n*max number of connected '0'(which can be n*m-dfs))
//Space Complexity:O(1)

class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length==0){
            return;
        }
                
        for(int i=0;i<board.length;i++){
            if(board[i][0] == 'O'){ //first row
                //board[i][0]='n';
                dfs(board,i,0);
            }
            if(board[i][board[0].length-1] == 'O'){ //last row
                //board[i][board[0].length-1]='n';
                dfs(board,i,board[0].length-1);
            }
        }
        
        for(int j = 0; j<board[0].length; j++){ //first column
            if(board[0][j] == 'O'){
                //board[0][j]='n';
                dfs(board,0,j);
            }
            if(board[board.length-1][j] == 'O'){ //last column
                //board[board.length-1][j]='n';
                System.out.println("j: " +(board.length-1)+ " j: " +j);
                dfs(board,board.length-1,j);
            }
        }

        flip(board);
        
        return ;
    }
    
    
    public void dfs(char [][]board,int i,int j){
        //System.out.println("i: " +i+ " j: " +j);

        if(i<0 || j<0 || i>=board.length || j >= board[0].length || board[i][j] == 'X' || board[i][j] == 'n' ){
            return;
        }

        board[i][j]='n';//no change

        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
        
        return;
    }
    
    public void flip(char[][] board){
        for (int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //System.out.println("board: " +board[i][j]);

                if(board[i][j] == 'O'){ //This should be flipped first, else it can interfere with next if stmt
                    board[i][j] ='X';
                }

                if(board[i][j] == 'n'){
                    board[i][j]='O';
                } 

            }
            
        }
        
    }
    
}