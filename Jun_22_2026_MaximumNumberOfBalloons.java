class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[26];
        for(char ch : text.toCharArray() ){
            freq[ch-'a']++;
        }
        return min(freq['b'-'a'],freq['a'-'a'],freq['l'-'a']/2,freq['o'-'a']/2,freq['n'-'a']);
    }
    public int min(int a,int b, int c, int d, int e){
        return Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));
    }
}
