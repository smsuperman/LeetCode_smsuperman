package LeetCode21;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Solution
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) { 
        ListNode newListNode = new ListNode(0);
        ListNode dummy = newListNode;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                newListNode.next = l1;
                newListNode = newListNode.next;
                l1 = l1.next;
            } else {
                newListNode.next = l2;
                newListNode = newListNode.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            newListNode.next = l2;

        }else{
            newListNode.next = l1;
        }
        

        return dummy.next;
    }

}