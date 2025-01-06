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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode curr = head;
        ListNode prev = curr;
        int max = curr.val;

        curr = curr.next;

        while(curr != null){
            if(curr.val < max){
                prev.next = curr.next;
            }else{
                max = curr.val;
                prev = curr;
            }
            curr = curr.next;
        }

        head = reverse(head);
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}