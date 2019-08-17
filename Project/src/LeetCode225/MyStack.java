package LeetCode225;

import java.util.LinkedList;
import java.util.Queue;


/**
 * MyStack
 */
public class MyStack {

    private Queue<Integer> queue;
    private Queue<Integer> minQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        minQueue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        while (!minQueue.isEmpty()) {
            queue.offer(minQueue.poll());
        }
        Queue temp = queue;
        queue = minQueue;
        minQueue = temp;
        
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return minQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        return minQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return minQueue.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such: MyStack obj =
 * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */