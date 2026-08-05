class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> graph[] = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            graph[v].add(u);
        }
        int[] ans = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int d[] = new int[numCourses];
        for (int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++){
                int next = graph[i].get(j);
                d[next]++;
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if(d[i] == 0) {
                q.add(i);
            }
        }
        return bfsTS(graph, ans, q, d, 0, numCourses);
    }

    public int[] bfsTS(ArrayList<Integer> graph[], int ans[], Queue<Integer> q, int[] d, int n, int numCourses) {
        while (!q.isEmpty()) {
            int curr = q.remove();
            ans[n] = curr;
            n++;
            for (int i = 0; i < graph[curr].size(); i++) {
                int c = graph[curr].get(i);
                d[c] -= 1;
                if (d[c] == 0) {
                    q.add(c);
                }
            }
        }
        if(n != numCourses){
            return new int[]{};
        }
        return ans;
    }
}