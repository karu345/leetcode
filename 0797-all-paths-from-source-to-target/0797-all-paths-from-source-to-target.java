class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        paths(graph, 0, graph.length-1, ans, l);
        return ans;
    }
    public void paths(int[][] graph, int src, int dest, List<List<Integer>> ans, List<Integer> l){
        l.add(src);
        if(src == dest){
            ans.add(new ArrayList<>(l));
            l.remove(l.size()-1);
            return;
        }
        for(int i = 0; i < graph[src].length; i++){
            int next = graph[src][i];
            paths(graph, next, dest, ans, l);
        }
        l.remove(l.size()-1);
    }
}