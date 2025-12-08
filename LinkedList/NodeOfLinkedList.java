package LinkedList;


public class NodeOfLinkedList {
    public static void main(String[] args) {
        //Node banao value assign karo
        //10 20 30 40 50
        Node b = new Node(10); 
        Node a = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50); 
        // now connect the nodes
        // 10 -> 20 -> 30 -> 40 -> 50 -> NULL
        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(d);
        System.out.println(b.next.next);
        System.out.println(a.next.next.next);
    }
}
