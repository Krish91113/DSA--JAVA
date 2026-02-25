import javax.swing.tree.TreeNode;

class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
public class identicalTree {
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
        System.out.println(isSameTree(a,a));
    }
    public static boolean isSameTree(Node p, Node q) {
        if(p== null && q== null) return true;
        if(p== null || q== null) return false;
        if(p.val!= q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
