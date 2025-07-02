/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//  142. Linked List Cycle II
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if(head==null || head.next==null )return null;
//         ListNode fast = head;
//         ListNode slow = head;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow==fast){
//                 ListNode entry = head;
//                 if(slow!=entry){
//                     entry = entry.next;
//                     slow = slow.next;
//                 }
//                 return entry;
//             }
//         }
//         return null;
//     }
// }



// Leetcode 142 - Linked List Cycle II
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect Cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find entry point
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }

        return null;
    }
}
