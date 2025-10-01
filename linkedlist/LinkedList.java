package linkedlist;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // add first
    public void addFirst(int data){
        // create new node 
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // newNode next = head
        newNode.next = head;
        // head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head= prev;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;  
    }
    //Slow-Fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.findMid(head).data);
    }
}
