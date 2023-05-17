public class Main {
    public static int getMaxSlidingSum(int[][] pyramid) {
        int n = pyramid.length;
        int[][] maxSums = new int[n][n];
        for (int i = 0; i < n; i++) {
            maxSums[n-1][i] = pyramid[n-1][i];
        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                maxSums[i][j] = pyramid[i][j] + Math.max(maxSums[i+1][j], maxSums[i+1][j+1]);
            }
        }
        return maxSums[0][0];
    }
    public static void main(String[] args) {
        int[][] pyramid = {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };
        int maxSum = getMaxSlidingSum(pyramid);
        System.out.println(maxSum);
    }
}

