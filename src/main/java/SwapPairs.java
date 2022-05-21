
public class SwapPairs {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode origHead = head.next;
        while(head.next != null && head.next.next != null){
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = head;
            head = head.next;
        }
    return origHead;
    }
}
