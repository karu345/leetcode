class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < s.length(); i++){
            int c = (int)(s.charAt(i) - '0');
            sum += c;
            prod *= c;
        }
        return prod - sum;
    }
}