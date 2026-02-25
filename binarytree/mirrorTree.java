
class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
public class mirrorTree {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.right=e;
        b.left=d;
        c.left=f;
        c.right=g;
        mirror(a);
    }
    private static void mirror(Node root) {
        // code here
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left= root.right;
        root.right= temp;
        System.out.print(root.val + " ");
        mirror(root.left);
        mirror(root.right);
    }
}
