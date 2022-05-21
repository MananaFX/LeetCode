public class RemoveNthFromEnd {
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int num = 1;
    ListNode point = head;
    while(point.next != null) {
      num++;
      point = point.next;
    }
    point = head;
    for(int i=1 ; i<num-n ; i++){
      point = point.next;
    }
    point.next = point.next.next;
    return head;
  }
}
