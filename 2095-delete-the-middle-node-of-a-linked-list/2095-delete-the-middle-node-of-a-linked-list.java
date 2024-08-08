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
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {  
            return null;
        }

        ListNode middle = findMiddle(head);
        ListNode prev = head;

        while (prev.next != middle) {
            prev = prev.next;
        }

        prev.next = prev.next.next; 

        return head;
    }
}