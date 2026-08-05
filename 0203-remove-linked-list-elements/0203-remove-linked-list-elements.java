class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode temp = head;
        
        
        ListNode dummy = new ListNode(-1);

        ListNode prev = dummy;
        
        dummy.next = head;

        while(temp != null){

            if(temp.val == val){

                prev.next = temp.next;
                
            }else{

                prev = prev.next;
            }
            
            
            
            temp = temp.next;
            
        }

        return dummy.next;
    }
}