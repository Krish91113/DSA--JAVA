// // public class leetcodedaily {
// //     public static int findClosest(int x,int y, int z){
// //         int distance1=Math.abs(x-z);
// //         int distance2=Math.abs(y-z);
// //         if(distance1 == distance2){
// //             return 0;
// //         }
// //         else if(distance1 < distance2){
// //             return 1;
// //         }else{
// //             return 2;
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int x=2;
// //         int y=7;
// //         int z=4;
// //         System.out.println(findClosest(x,y,z));
// //     }
// // }

// // count element with max frequency

// public class leetcodedaily {
//     public static int maxFrequencyElements(int[] nums) {
//         int[] freq = new int[101];
//         int maxFreq = 0;
//         for(int i : nums){
//             freq[i]++;
//             maxFreq = Math.max(maxFreq, freq[i]);
//         }
//         int ans=0;
//         for(int i : freq){
//             if(i == maxFreq) ans += i;
//         }
//     return ans;
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,2,3,3,3,4,4,4,4};
//         System.out.println(maxFrequencyElements(arr));
//     }
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcodedaily{
    public static int swimInWater(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        List<int[]> edges = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0)
                    edges.add(new int[]{Math.max(grid[i][j], grid[i-1][j]), i*n+j, (i-1)*n+j});
                if (j > 0)
                    edges.add(new int[]{Math.max(grid[i][j], grid[i][j-1]), i*n+j, i*n+j-1});
            }
        }
        
        Collections.sort(edges, (a, b) -> a[0] - b[0]);
        int[] parent = new int[m * n];
        for (int i = 0; i < m * n; i++) parent[i] = i;
        
        for (int[] edge : edges) {
            // Error fix: calls to union and find now resolve because they are static
            union(parent, edge[1], edge[2]);
            if (find(parent, 0) == find(parent, m*n-1))
                return edge[0];
        }
        return grid[0][0];
    }
    
    // ✅ Added 'static' keyword here
    private static int find(int[] parent, int x) {
        if (parent[x] != x)
            parent[x] = find(parent, parent[x]);
        return parent[x];
    }
    
    // ✅ Added 'static' keyword here
    private static void union(int[] parent, int x, int y) {
        parent[find(parent, x)] = find(parent, y);
    }

    public static void main(String[] args) {
        // NOTE: The example array for grid has an issue with the last row's length (5 elements)
        // compared to others (4 elements). I've corrected the array structure below
        // assuming a 6x4 grid as implied by the rest of the code logic.
        int grid [][] = {{0,1,2,3},{4,24,23,22},{21,5,12,13},{14,15,16,11},{17,18,19,20},{10,9,8,7}}; // Fixed 6th row to have 4 elements (removed '6')
        System.out.println(swimInWater(grid));
    }
}