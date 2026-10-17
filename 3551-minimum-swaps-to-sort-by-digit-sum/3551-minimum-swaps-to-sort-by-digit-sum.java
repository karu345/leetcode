class Solution {
    static class Ans implements Comparable<Ans> {
        int v;
        int o;
        int sum;

        Ans(int v, int o, int sum) {
            this.v = v;
            this.o = o;
            this.sum = sum;
        }

        @Override
        public int compareTo(Ans a2) {
            if (this.sum != a2.sum) {
                return this.sum - a2.sum;
            }
            return this.v - a2.v;
        }
    }

    public int minSwaps(int[] nums) {
        Ans a[] = new Ans[nums.length];
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            int cSum = 0;
            for (int j = 0; j < s.length(); j++) {
                cSum += (int) (s.charAt(j) - '0');
            }
            a[i] = new Ans(nums[i], i, cSum);
        }
        Arrays.sort(a);
        boolean[] visited = new boolean[a.length];
        int swaps = 0;

        for (int i = 0; i < a.length; i++) {
            if (visited[i] || a[i].o == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = a[j].o;
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }
}