package algorithm.dynamic;

public class MinCostPath {

    public static void main(String...args){

        int [][] cost = {
                {5,8,13,2,3},
                {2,7,11,5,7},
                {6,8,3,9,2},
                {4,5,1,8,3},
                {10,3,9,6,4}
        };

        System.out.println(minCostDynamic(cost, 4, 4));
        System.out.println(minCostRecursive(cost, 4, 4));

    }

    private static int minCostDynamic(int [][] cost, int m, int n){
        int [][] tc = new int[m+1][n+1];

        tc[0][0] = cost[0][0];

        for (int i=1; i<=m; i++){
            tc[i][0] = tc[i-1][0] + cost[i][0];
        }

        for (int j=1; j<=n; j++){
            tc[0][j] = tc[0][j-1] + cost[0][j];
        }

        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                tc[i][j] = Math.min(tc[i-1][j-1], Math.min(tc[i][j-1], tc[i-1][j])) + cost[i][j];
            }
        }
        return tc[m][n];
    }

    private static int minCostRecursive(int [][] cost, int m, int n){
        if (n<0 || m<0)
            return Integer.MAX_VALUE;
        else if (m==0 && n==0)
            return cost[m][n];

        return cost[m][n] + Math.min(minCostRecursive(cost, m-1, n-1), Math.min(minCostRecursive(cost, m, n-1), minCostRecursive(cost, m-1, n)));
    }
}
