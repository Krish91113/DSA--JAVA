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
    int size=0;
    void delete(int idx){
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    void insertAtIndex(int idx,int val){
        if(idx>size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            Node t = new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
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
        size++;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        size--;
    }
    void deleteAtTail(){
        Node temp=head;
        if(tail==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            if(temp.next == tail){
                temp.next=null;
            }
            temp=temp.next;
        }
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        System.out.println(ll.size);
        ll.display();
        ll.insertAtIndex(2, 50);
        ll.display();
        ll.delete(3);
        ll.display();
    }   
}
