import java.util.Stack;

class MyQueue {
    Stack<Integer> st ;
    /** Initialize your data structure here. */
    public MyQueue() {
        st = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        st.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int i = st.get(0);
        st.remove(0);
        return i;
    }

    /** Get the front element. */
    public int peek() {
        return st.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st.isEmpty();
    }
}
