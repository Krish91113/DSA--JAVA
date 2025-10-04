package linkedlist;

public class palindrome {

    public static boolean isPalindrome(LinkedList list) {
        // Find middle using slow/fast pointer
        Node mid = list.findMid(list.head);
        // Reverse second half
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Compare reversed second half with first half
        Node left = list.head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
