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
    public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }

    // Find the length of the list and the last node
    ListNode fast = head, slow = head;
    int length = 1;
    while (fast.next != null) {
        fast = fast.next;
        length++;
    }

    // Adjust k to handle cases where k is larger than the list length
    k %= length;
    if (k == 0) {
        return head;
    }

    // Move fast pointer to the (length - k)th node
    fast = head;
    for (int i = 0; i < length - k - 1; i++) {
        fast = fast.next;
    }

    // Rotate the list
    ListNode newHead = fast.next;
    fast.next = null;
    slow = newHead;
    while (slow.next != null) {
        slow = slow.next;
    }
    slow.next = head;

    return newHead;
}

}