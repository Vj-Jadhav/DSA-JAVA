class Solution {

    static int dfs(int [][] grid, int i , int j){
        
     if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){

            return 0;
     } 
        
     if(grid[i][j] == 0){

            return 0;
        }

      grid[i][j] = 0;
         
      int area = 1;

      area += dfs(grid,i - 1, j);

      area +=   dfs(grid,i + 1, j);

      area += dfs(grid, i, j- 1);

      area += dfs(grid, i , j+ 1);

       return area;
    }
    public int maxAreaOfIsland(int[][] grid) {

        int area = 0;

        int max = 0;
        
        int n = grid.length;

        int m = grid[0].length;
       
           int count = 0;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                if(grid[i][j] == 1){

                   area = dfs(grid, i, j);
                  max = Math.max(max, area);
                }
            }
        }

       return max;
    }
}