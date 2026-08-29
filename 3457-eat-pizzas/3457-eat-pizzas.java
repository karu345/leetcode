class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int len = pizzas.length;
        int days = len / 4;
        long ans = 0;
        if (days == 1) {
            long z = pizzas[len - 1];
            ans = z;
            return ans;
        }
        if (days == 2) {
            long z1 = pizzas[len - 1];
            long y2 = pizzas[len - 3];
            ans = z1 + y2;
            return ans;
        }
        int odd = (days+1) / 2;
        int even = days / 2;
        long oddMax = 0;
        long evenMax = 0;
        for(int i = 1; i <= odd; i++){
            oddMax += pizzas[len-i];
        }
        for(int i = 0; i < even; i++){
            evenMax += pizzas[(len-odd-2)-(i*2)];
        }
        ans = oddMax + evenMax;
        return ans; 
    }
}