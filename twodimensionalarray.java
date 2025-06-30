// import java.util.*;
// public class twodimensionalarray {
//     public static void largest(int matrix[][],int largest, int smallest){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j] > largest){
//                     largest = matrix[i][j];
//                 }else if(matrix[i][j]<smallest){
//                     smallest = matrix[i][j];
//                 }
//             }
//         }
//         System.out.println("the largest element is : " +largest);
//         System.out.println("the smallest element is : " +smallest);
//     }
//     public static void main(String[] args) {
//         int matrix [][] = new int[3][3];
//         int n=3 , m=3;
//         Scanner sc = new Scanner(System.in);
//         // input
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         //Output
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print( matrix[i][j]+ " ");
//             }
//             System.out.println();
//         }
//         int largest = Integer.MIN_VALUE;
//         int smallest = matrix[0][0];
//         largest(matrix,largest,smallest);
//     }
// }

// Spiral Matrix
// public class twodimensionalarray {
//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;
//         while(startRow<=endRow && startCol<=endCol){
//             //top
//             for(int j=startCol;j<=endCol;j++){
//                 System.out.print(matrix[startRow][j]+" ");
//             }
//             // right
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.print(matrix[i][endCol]+" ");
//             }
//             //Bottom
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+" ");
//             }
//             //left
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//         System.out.println();
//     }
//     public static void main (String[] args) {
//         int matrix [][] = {{1,2,3,4},
//                            {5,6,7,8},
//                            {9,10,11,12},
//                            {13,14,15,16}};
//         printSpiral(matrix);
//     }
// }

// Search a given number in a matrix
// Brute force approach
// public class twodimensionalarray {
//     public static void searchMatrix(int matrix[][],int key){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j] == key){
//                    System.out.println("matrix found at index :" + "(" + i + "," + j + ")");
//                 }
//             }
//         }
//     }
// public static void main(String[] args) {
//         int matrix [][] ={{10,20,30,40},
//                            {15,25,35,45},
//                            {27,29,37,48},
//                            {32,33,39,50}};
//         int key = 50;   
//         searchMatrix(matrix, key);                
//     } 
// }
// Optimal approach
// public class twodimensionalarray {
//     public static int searchMatrix(int matrix[][],int key){
//         int row =0,col=matrix[0].length-1;
//         int count =0;
//         while(row<matrix.length && col>=0){
//             if(matrix[row][col] == key){
//                 System.out.println("(" + row + ","+ col +")");

//             }else if(key<matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//          int matrix [][] ={{4,7,8},{8,8,7}};
//          int key = 7;  
//          System.out.println(searchMatrix(matrix, key));
//    } 
    
// }

// Transpose of a matrix
public class twodimensionalarray{
    public static int [][] transpose(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] result = new int [m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}