//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int newMatrix[][] = new int [r][c]; 
        int x = nums.length;
        int y = nums[0].length;
        int new1D[] = new int[x*y];
        int index=0;
        
        //Covert to 1D
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                new1D[index++] = nums[i][j];
            }
        }
        //System.out.println(Arrays.toString(new1D));
        
        index=0;
        
        //Check if it is legal to convert else return old matrix
        if(r*c == x*y) {
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                   newMatrix[i][j]=new1D[index++];
                }
            }
            return newMatrix;
        }
        else {
            return nums;
        }
        
    }
}

