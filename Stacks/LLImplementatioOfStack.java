package Stacks;
class Node {
    int val;
    Node next;
    Node(int val){
        this.val =val;
    }
}
class MyStack {
    Node head;
    int size=0;
    void push(int val){
        Node temp = new Node(val);
        if(head == null) temp=head=tail;
       else{
           temp.next =head;
           head=temp;
       }
       size++;
    }
    void pop(){
        if(head == null) {
            System.out.println("Stack is empty");
            return;
        }
        head=head.next;
        size--;
    }
    void peek(){
        if(head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(head.val);
    }
    void size(){
        System.out.println(size);
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
}
public class LLImplementatioOfStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
    }
}
