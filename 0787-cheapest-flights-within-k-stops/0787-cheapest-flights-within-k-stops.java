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

    public class Trio {
        int curr;
        int stop;
        int cost;

        Trio(int curr, int stop, int cost) {
            this.curr = curr;
            this.stop = stop;
            this.cost = cost;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edges> graph[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int st = flights[i][0];
            int dest = flights[i][1];
            int weight = flights[i][2];
            graph[st].add(new Edges(st, dest, weight));
        }
        int dist[] = new int[n];
        mini(graph, dist, src, dst, k + 1);
        if (dist[dst] == Integer.MAX_VALUE) {
            return -1;
        }
        return dist[dst];
    }

    public int[] mini(ArrayList<Edges> graph[], int dist[], int src, int dst, int k) {
        Queue<Trio> q = new LinkedList<>();
        q.add(new Trio(src, 0, 0));
        for (int i = 0; i < dist.length; i++) {
            if (i == src) {
                dist[src] = 0;
            } else {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        while (!q.isEmpty()) {
            Trio t = q.remove();
            int c = t.curr;
            if (t.stop > k) {
                break;
            }
            for (int i = 0; i < graph[c].size(); i++) {
                Edges e = graph[c].get(i);
                int next = e.d;
                if (dist[c] != Integer.MAX_VALUE && dist[next] > t.cost + e.w && t.stop < k) {
                    dist[next] = t.cost + e.w;
                    q.add(new Trio(next, t.stop+1, dist[next]));
                }
            }
        }
        return dist;
    }
}