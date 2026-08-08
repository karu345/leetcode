class Solution {
    public class Edges {
        int s;
        int d;
        int w;

        Edges(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public class Pair implements Comparable<Pair> {
        int n;
        int d;

        Pair(int n, int d) {
            this.n = n;
            this.d = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.d - p2.d;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edges> graph[] = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            graph[u].add(new Edges(u, v, w));
        }
        return dijkstra(graph, n, k);
    }

    public int dijkstra(ArrayList<Edges> graph[], int n, int k){
        boolean vis[] = new boolean[n+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[n+1];
        dist[0] = 0;
        pq.add(new Pair(k, 0));
        for(int i = 1; i < dist.length; i++){
            if(i == k){
                dist[k] = 0;
            }else{
                dist[i] = Integer.MAX_VALUE;
            }
        }
        while(!pq.isEmpty()){
            int curr = pq.remove().n;
            if(!vis[curr]){
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edges e = graph[curr].get(i);
                    int next = e.d;
                    int w = dist[curr] + e.w;
                    if(w < dist[next]){
                        dist[next] = w;
                        pq.add(new Pair(next, w));
                    }
                }
            }
        }
        int max = 0;

        for(int i = 1; i <= n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            max = Math.max(max, dist[i]);
        }

        return max;
    }
}