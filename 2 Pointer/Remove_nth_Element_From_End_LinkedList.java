public class Remove_nth_Element_From_End_LinkedList {


//     Definition for singly-linked list.
     public class ListNode {
        int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            int size = 1;

            ListNode temp = head;

            while(temp.next != null){
                size++;
                temp = temp.next;
            }

            int removingElement = size - n + 1;
            int count = 0;
            ListNode previous = dummy;
            ListNode current = head;

            while(count < removingElement - 1){
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;
            current.next = null;

            return dummy.next;
        }
}
