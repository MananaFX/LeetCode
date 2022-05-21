import java.util.ArrayList;
import java.util.List;

public class ReversePrint {
    ArrayList<Integer> list = new ArrayList<>();
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public int[] reversePrint(ListNode head) {
        print(head);
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);
        return ans;
    }
    void print(ListNode head){
        if(head!=null){
            if(head.next!=null){
                print(head.next);
            }
            list.add(head.val);
        }
    }
}
