class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[n];
        int count = 1;
        visited[0] = true;
        q.add(0);

        while(!q.isEmpty()){

            int node = q.poll();


            for(int neighbour : rooms.get(node)){

                 if(!visited[neighbour]){

                    visited[neighbour] = true;

                    q.add(neighbour);

                    count++;
                 }

                 
            }

        
            
        }

       return count == n ;

    }
}