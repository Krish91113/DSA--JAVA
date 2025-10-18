import java.util.LinkedList; // ⚠️ Note: This is the JCF LinkedList, not your custom one!


import linkedlist.LinkedList.Node;

public class LinkedlistJCF {

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newleft = mergeSort(head);
        Node newright = mergeSort(rightHead);

        return merge(newleft, newright);
    }

    public static void main(String[] args) {
        linkedlist.LinkedList list = new linkedlist.LinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.printList();
        list.head = new LinkedlistJCF().mergeSort(list.head);
        list.printList();
    }
}
