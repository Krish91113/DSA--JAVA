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

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer> li=new ArrayList<>();
        ListNode prev=head,curr=prev.next,next=curr.next;
        int i=2;
        while(next!=null){
            if(curr.val>prev.val && curr.val>next.val){
                li.add(i);
            }
            if(curr.val<prev.val && curr.val<next.val){
                li.add(i);
            }
            prev=prev.next;
            curr=curr.next;
            next=next.next;
            i++;
        }

        if(li.size()!=0){
            Collections.sort(li);
            if (li.size() < 2) {
    return new int[]{-1, -1};
}
int minDist = Integer.MAX_VALUE;
for (int j = 1; j < li.size(); j++) {
    minDist = Math.min(minDist, li.get(j) - li.get(j - 1));
}
ans[0] = minDist;
ans[1] = li.get(li.size() - 1) - li.get(0);
return ans;
        }
        return ans;
    }
    
}