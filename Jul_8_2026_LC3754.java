// simulation , brute
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
       for(char ch : (n+"").toCharArray() ) {
            int dgt = ch-'0';
            n /= 10;
            if (dgt != 0) {
                x = x*10+dgt;
                sum += dgt;
            }
        }
        return x * sum;
    }
}
