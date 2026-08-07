class Solution {

    static void dfs(int city,int[][] isConnected,boolean [] visited){
       
       visited[city] = true;

       for(int j = 0; j < isConnected.length; j++){

        if(isConnected[city][j] == 1 && !visited[j]){

            dfs(j,isConnected,visited);
        }
       }

    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;

        boolean [] visited = new boolean[V]; 

        int provinces = 0;

        for(int i = 0; i < V; i++){

            if(!visited[i]){
                dfs(i,isConnected,visited);
                provinces++;
            }
        }

        return provinces;
    }
}