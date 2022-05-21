public class MergeTwoLists {
    static class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return null;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode head = new ListNode();
        ListNode index = new ListNode();
        int flag = 0;
        flag = list1.val<list2.val ? 1:2;
        head = list1.val>=list2.val ? list2:list1;
        index = list1.val<list2.val ? list2:list1;
        while(head.next != null && index != null){
            if(head.next.val<=index.val)
                head = head.next;
            else{
                ListNode tmp = index.next;
                index.next = head.next;
                head.next = index;
                head = head.next;
                index = tmp;
            }
        }
        if(head.next == null)
            head.next = index;
        if(flag == 1 )
            return list1;
        else
            return list2;
    }
    public static void main(String args[]){
        //1,2,4 1,3,4
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(new MergeTwoLists().mergeTwoLists(list1,list2));
    }
}
