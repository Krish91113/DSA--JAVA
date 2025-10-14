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

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1-find mid
        Node mid = findMid(head);
        Node curr = mid;
        Node prev = null;
        //step2 - reverse 2nd half
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //step3 - check left half and right half
        curr = head;
        while(prev!=null){
            if(curr.data != prev.data){
                return false;
            }
            curr = curr.next;
            prev = prev.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       head = new Node(1);
       head.next = new Node(2);
       head.next.next= new Node(3);
       head.next.next.next= head;
       //1->2->3->1
       System.out.println(isCycle());
    }
}
