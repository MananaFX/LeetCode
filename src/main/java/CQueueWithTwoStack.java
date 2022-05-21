import java.util.Deque;
import java.util.LinkedList;

public class CQueueWithTwoStack {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQueueWithTwoStack() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            if(stack1.isEmpty())
                return -1;
            else{
                while(!stack1.isEmpty())
                    stack2.push(stack1.pop());
                return stack2.pop();
            }
        }else
            return stack2.pop();
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
