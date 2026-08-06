class Solution {
    public int smallestNumber(int n, int t) {
        while (prod(n) % t != 0) {
            n++;
        }
        return n;
    }

    public int prod(int n) {
        int p = 1;
        while (n > 0) {
            String s = Integer.toString(n);
            int a = (int)(s.charAt(s.length()-1) - '0');
            n = n/10;
            p = p*a;
        }
        return p;
    }
}