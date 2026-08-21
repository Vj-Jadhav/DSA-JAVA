
class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode();
        
        ListNode temp = head;
        
        while(temp != null){
            
            ListNode next = temp.next;
            ListNode prev = dummy;
         
         while(prev.next != null && prev.next.val <= temp.val){

             prev = prev.next;
         }
            
            temp.next = prev.next;
            prev.next = temp;
            temp = next;
        }

         return dummy.next;
    }
}