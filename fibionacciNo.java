import java.util.Arrays;

class fibionacciNo {
    public static int[] dp = new int[100005]; //DP array to store the results of subproblems

    //Recursive function to calulate Fibonacci number
    public static int f(int n) {
        if(n == 0 || n == 1) return n; //It says if the value of n is 0 or 1 return 1
        if(dp[n] != -1) return dp[n]; // if value is not -1 we can directly return ans.
        // if the above "if case" doesn't execute, it means sub problem has not been solved
        return dp[n] = f(n-1) + f(n-2);
        
    }

    // Wrapper function to initiate the calculation
    public int fib(int n){
        dp = new int[100005]; // Initialize the dp array with -1 to indicate that no subproblem has been solved yet
        Arrays.fill(dp, - 1);

        return f(n); //Call the recursive function to calculate the Fibonnaci Number
    }
}

/*-------------------------------------------------------------------------------------- */

class Solution {
    public static int[] dp = new int[100005];
    public static int f(int i) {
        if(i == 0 || i == 1) return i; //It says if the value of n is 0 or 1 return 1
        if(dp[i] != -1) return dp[i]; // if value is not -1 we can directly return ans.
        // if the above "if case" doesn't execute, it means sub problem has not been solved
        return dp[i] = f(i - 1) + f(i - 2);    
    }

    public static int f_bu(int n){
        dp = new int[100005];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int fib(int n){
        // dp = new int[100005];
        // Arrays.fill(dp, - 1);
        // return f(n);
        return f_bu(n);
    }
}