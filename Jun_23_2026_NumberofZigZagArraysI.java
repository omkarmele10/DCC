// top down but this give tle
class Solution {
    int dp[][][];
    int MOD = (int)1e9+7;
    int l ;
    int r;
    int n ;
    public int zigZagArrays(int n, int l, int r) {
        this.l = l;
        this.r = r;
        this.n = n;
        dp = new int[2002][2][2002];
        for(int i = 0; i<2002; i++){
            for(int j = 0; j<2; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        // why two calls
        // 1st is for increasing , 2nd is for decreasing
        return (solve(0,0,1)%MOD + solve(0,2001,0)%MOD)%MOD;
    }
    public int solve(int idx,int prev,int isIncreasing){
        if(idx == n)return 1;
        if(dp[idx][isIncreasing][prev] != -1)return dp[idx][isIncreasing][prev] ;

        int ans = 0;
        if(isIncreasing==1){
            for(int currNum = prev+1; currNum<=r; currNum++){
                ans = (ans%MOD +solve(idx+1,currNum,isIncreasing==1?0:1)%MOD )%MOD;
            }
        }else{
            for(int currNum = prev-1; currNum>=l; currNum--){
                ans = (ans%MOD +solve(idx+1,currNum,isIncreasing==1?0:1)%MOD )%MOD;
            }
        }
        return dp[idx][isIncreasing][prev] =ans;
    }
}
