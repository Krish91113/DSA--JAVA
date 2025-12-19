// package LinkedList;



// public class DisplayList {

//     public static void getVal(Node head, int index){
//         Node temp = head;
//         for(int i=0; i<index; i++){
//             if(temp == null){
//                 System.out.println("Index out of bounds");
//                 return;
//             }
//             temp = temp.next;
//         }
//         if(temp == null){
//             System.out.println("Index out of bounds");
//         } else {
//             System.out.println(temp.val);
//         }
//     }
//     public static void display(Node head){
//         Node temp = head;
//         while(temp != null){
//             if(temp.val == temp.next.val){
//                 continue;
//             }
//             System.out.print(temp.val + " -> ");
//             temp = temp.next;
//         }
//         System.out.print("NULL");
//     }
//     public static void main(String[] args) {
//         Node a = new Node(10); 
//         Node b = new Node(10); 
//         Node c = new Node(30); 
//         Node d = new Node(40); 
//         Node e = new Node(50); 
//         // now connect the nodes
//         // 10 -> 20 -> 30 -> 40 -> 50 -> NULL
//         a.next=b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = null;

//         display(a);
        
//     }
// }
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode dummy =new ListNode(-1);
//         ListNode t= dummy;
//         ListNode i=head;
//         while(i!=null){
//             if(i.next==null || i.val!=i.next.val){
//                 t.next=i;
//                 t=i;
//                 i=i.next;
//             }else{
//                 ListNode j = i.next;
//                 while(j!=null && i.val == j.val){
//                     j=j.next;
//                 }
//                 i=j;
//             }
//         }
//         t.next=i;
//         return dummy.next;
//     }
// }

// class Solution {
//     private int length (ListNode head){
//         ListNode temp=head;
//         int length=0;
//         while(temp!=null){
//             temp=temp.next;
//             length++;
//         }
//         return length;
//     }
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head == null || head.next==null) return head;
//         int n=length(head);
//         k=k%n;
//         if(k==0) return head;
//         ListNode slow=head;
//         ListNode fast=head;
//         for(int i=1;i<=k+1;i++){
//             fast=fast.next;
//         }
//         while(fast!=null){
//             slow=slow.next;
//             fast=fast.next;
//         }
//         ListNode a =slow.next;
//         slow.next=null;
//         ListNode tail=a;
//         while(tail.next!=null){
//             tail=tail.next;
//         }
//         tail.next=head;
//         return a;
//     }
// }

//partiton linked list 


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t1=d1;
        ListNode t2=d2;
        ListNode t=head;
        while(t!=null){
            if(t.val < x){
                t1.next=t;
                t1=t1.next;
            }else{
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
        }
        t1.next=d2.next;
        t2.next=null;
        return d1.next;
    }
}

//partitiion a linked list around a value x such that all nodes less than x come before nodes greater than or equal to x.


class Solution {
    public static Node partition(Node head, int x) {
        // Your code here
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node d3=new Node(-1);
        Node t1=d1;
        Node t2=d2;
        Node t3=d3;
        Node t=head;
        while(t!=null){
            if(t.data < x){
                t1.next=t;
                t1=t1.next;
            }else if(t.data > x){
                t3.next=t;
                t3=t3.next;
            }else{
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
        }
        t1.next=d2.next;
        t2.next=d3.next;
        t3.next=null;
        
        return d1.next;
    }
}