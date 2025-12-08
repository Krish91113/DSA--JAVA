package LinkedList;


class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class DisplayList {

    public static void getVal(Node head, int index){
        Node temp = head;
        int count =0;
        while(temp != null){
            if(count == index){
                System.out.println(temp.val);
                return;
            }
            count++;
            temp = temp.next;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
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

        // display(a);
        getVal(a, 6);
    }
}