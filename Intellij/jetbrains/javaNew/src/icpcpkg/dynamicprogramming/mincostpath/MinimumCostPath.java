package icpcpkg.dynamicprogramming.mincostpath;

public class MinimumCostPath {

    public static void main(String[] args){

        int [][] cost = {
                {3,4,6,2},
                {4,2,5,1},
                {5,3,0,7},
                {1,2,7,8}
        };

        System.out.println(minCostRecursive(cost, 3, 3));
        System.out.println(minCostDynamic(cost, 3, 3));

    }

    private static int minCostDynamic(int [][] cost, int m, int n){
        int [][] tc = new int[m+1][n+1];
        tc[0][0] = cost[0][0];

        for (int i=1; i<=m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];

        for (int j=1; j<=n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];

        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                tc[i][j] = cost[i][j] + Math.min(tc[i-1][j-1],
                        Math.min(tc[i][j-1], tc[i-1][j]));
            }
        }

        return tc[m][n];
    }

    private static int minCostRecursive(int [][] cost, int m, int n){
        if (m<0 || n<0)
            return Integer.MAX_VALUE;
        if (m==0 && n==0)
            return cost[0][0];

        return cost[m][n] + Math.min(minCostRecursive(cost, m-1, n-1),
                Math.min(minCostRecursive(cost, m, n-1), minCostRecursive(cost, m-1, n)));
    }
}
