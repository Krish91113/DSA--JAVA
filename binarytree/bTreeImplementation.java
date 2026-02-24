
// class Node{
//         int val;
//         Node left;
//         Node right;
//         Node(int val){
//             this.val = val;
//         }
//     }
// public class bTreeImplementation {
    
//     public static void main(String[] args) {
//         // Creating a binary tree with the following structure:
//         //         3
//         //        / \
//         //       4   2
//         //      / \  / \
//         //     -1  1 6  9
//         Node a = new Node(3);
//         Node b = new Node(4);
//         Node c = new Node(2);
//         Node d = new Node(-1);
//         Node e = new Node(1);
//         Node f = new Node(6);
//         Node g = new Node(9);
//         a.left = b;
//         a.right = c;
//         b.right=e;
//         b.left=d;
//         c.left=f;
//         c.right=g;
//         display(a);
//         System.out.println();
//         System.out.println(size(a));
//         System.out.println(sumOfBinaryTree(a));
//         System.out.println(product(a));
//         System.out.println(max(a));
//         System.out.println(findMin(a));
//     }
//     public static int size(Node root){
//         if(root == null) return 0;
//         return 1 + size(root.left) + size(root.right);
//     }

//     public static int sumOfBinaryTree(Node root){
//         if(root ==  null) return 0;
//         return root.val + sumOfBinaryTree(root.left) + sumOfBinaryTree(root.right);
//     }
//     public static int product(Node root){
//         if(root ==  null) return 1;
//         return root.val * product(root.left) * product(root.right);
//     }

//     public static int max(Node root){
//         if(root == null) return Integer.MIN_VALUE;
//         return Math.max(root.val, Math.max(max(root.left), max(root.right)));
//     }
//     public static int findMin(Node root) {
//         if(root == null) return Integer.MAX_VALUE;
//     }
//     public static void display(Node root){
//         if(root == null) return;
//         System.out.print(root.val + " ");
//         display(root.left);
//         display(root.right);
//     }
// }
