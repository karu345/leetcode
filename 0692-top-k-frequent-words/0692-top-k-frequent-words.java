class Solution {
    static class Answer implements Comparable<Answer> {
        String w;
        int i;

        Answer(String w, int i) {
            this.w = w;
            this.i = i;
        }

        @Override
        public int compareTo(Answer a2) {
            if (this.i != a2.i) {
                return a2.i - this.i;
            }
            return this.w.compareTo(a2.w);
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Answer> pq = new PriorityQueue<>();
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> sol = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (!hm.containsKey(words[i])) {
                hm.put(words[i], 1);
            } else {
                hm.put(words[i], hm.get(words[i]) + 1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i])) {
                int val = hm.get(words[i]);
                pq.add(new Answer(words[i], val));
                hm.remove(words[i]);
            }
        }
        int c = 0;
        while (c != k) {
            Answer ans = pq.peek();
            String a = ans.w;
            sol.add(a);
            pq.remove();
            c++;
        }
        return sol;
    }
}