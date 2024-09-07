import java.util.Arrays;

public class nthFibonacci{
    public static long mod = 1000000007; 
    public static long[] dp;
    public static long f(int i){
        if(i == 0 || i == 1 || i == 2){
            return i;
        } 

        // if dp[n] has already been calculated, return the stored result
        if (dp[i] != -1) return dp[i];

        // we will store the reult in dp[n]
        long singleWays = f(i-1)%mod;
        long pairWays = ((i-1)%mod * f(i-2)%mod)%mod;
        return dp[i] = ((singleWays%mod) + (pairWays%mod))%mod;
    }
    public static int fibonacciNumber(int n){

    // Initialize the dp array with -1 to indicate that no subproblem has been stored
    dp = new long[n + 1];
    Arrays.fill(dp, -1);

    // Call the recursive function to calculate the Fibonacci Number
    return (int)f(n);
    }
}
