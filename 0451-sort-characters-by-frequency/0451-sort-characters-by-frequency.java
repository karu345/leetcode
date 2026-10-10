class Solution {
    static class PQ implements Comparable<PQ>{
        char ch;
        int c;

        PQ(char ch, int c){
            this.ch = ch;
            this.c = c;
        }

        @Override
        public int compareTo(PQ p2){
            return p2.c - this.c;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        PriorityQueue<PQ> pq = new PriorityQueue<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(!hm.containsKey(curr)){
                hm.put(curr, 1);
            }else{
                hm.put(curr, hm.get(curr)+1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(hm.containsKey(curr)){
                int val = hm.get(curr);
                pq.add(new PQ(curr, val));
                hm.remove(curr);
            }
        }
        while(!pq.isEmpty()){
            PQ a = pq.peek();
            int i = 0;
            while(i < a.c){
                char curr = a.ch;
                ans += curr;
                i++;
            }
            pq.remove();
        }
        return ans;
    }
}