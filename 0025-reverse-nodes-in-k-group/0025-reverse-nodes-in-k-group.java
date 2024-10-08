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
    public ListNode reverseLL(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode front;

        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode getKNode(ListNode temp, int k){
        k -= 1;

        while(temp != null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        
        ListNode prev = null;
        
        while (temp != null) {
            
            ListNode kNode = getKNode(temp, k);
            
            if (kNode == null) {
                if (prev != null) {
                    prev.next = temp;
                }
                
                break;
            }
            
            ListNode next = kNode.next;
            
            kNode.next = null;
            
            reverseLL(temp);
            
            if (temp == head) {
                head = kNode;
            } else {
                prev.next = kNode;
            }
            prev = temp;
            temp = next;
        }
        return head;
    }
}