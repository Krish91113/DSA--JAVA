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
        for(int i=0; i<index; i++){
            if(temp == null){
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Index out of bounds");
        } else {
            System.out.println(temp.val);
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.val == temp.next.val){
                continue;
            }
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(10); 
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

        display(a);
        
    }
}