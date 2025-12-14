package LinkedList;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println(" ");
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) tail=head=temp;
        else {
            temp.next=head;
            head=temp;
        }
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.display();
        ll.deleteAtHead();
        ll.display();
    }   
}
