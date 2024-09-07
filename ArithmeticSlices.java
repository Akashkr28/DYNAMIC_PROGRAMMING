class ArithmeticSlices {
    public static int[] arr;
    public static int[] dp = new int[5005];
    public static int f(int i) {
        if( i == 0 || i == 1) return 0; // as a base case a triplet cannot be formed with 0th amd 1th or both index value

        if( arr[i] - arr[i-1] != arr[i-1] - arr[i-2] ){ // if value at index i[4] - index i-1[2] !=  index i-1[2] - index i-2[1]
            return dp[i] = 0;   // then return 0
        } else {
            return dp[i] = 1 + f(i-1);
        }
    }

    public static int fbu() {
        for(int i = 0; i < arr.length; i++) {
            if( i == 0 || i == 1) dp[i] = 0;
            else {
                if( arr[i] - arr[i-1] != arr[i-1] - arr[i-2] ){
                    dp[i] = 0;   // then return 0
                        } else {
                    dp[i] = 1 + dp[i-1];
                }
            }
        }

        // sum all of them
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans += dp[i];
        }
        return ans;
    }

    public int numberOfArithmeticSlices(int[] nums) {
        // int ans = 0;
        arr = nums;
        // Arrays.fill(dp, -1);
        // for(int i = 0; i < nums.length; i++){
        //     ans += f(i);
        // }
        return fbu();
    }
}