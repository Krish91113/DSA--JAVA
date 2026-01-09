package Stacks;

import java.util.Stack;

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
        if(head == null) head=temp;
       else{
           temp.next =head;
           head=temp;
       }
       size++;
    }
    int pop(){
        if(head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = head.val;
        head=head.next;
        size--;
        return x;
    }
    int peek(){
        if(head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
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
        st.pop();
        st.peek();
        st.display();
    }
    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == "["){
                st.push(ch);
            }else{
                if(st.size() == 0) return false;
                char top = st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size() ==0);
    }
    static boolean sameStyle(char a , char b){
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        return false;
    }
}
