class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        Queue<Integer> q = new LinkedList<>();
         
          for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<>();
        }     
       int[] indegree = new int[numCourses];
        
        for(int[] edge : prerequisites){

         int course = edge[0];
         int prerequisite = edge[1];

         graph[prerequisite].add(course);
         indegree[course]++;

       }
       for(int i = 0; i < numCourses; i++){

            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int count = 0;


       while(!q.isEmpty()){
          

          int n = q.poll();
          
          count++;

          for(int neighbour : graph[n]){

             indegree[neighbour]--;

             if(indegree[neighbour] == 0){
                
                  q.add(neighbour);             }
          }
       }

       return numCourses == count ;
       
    }
}