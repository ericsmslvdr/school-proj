
public class StackUsingArray {

    int size;
    int arr[];
    int top;

    public StackUsingArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        return arr[top];
    }

    public void push(int num) {
        if (!isFull()) {
            arr[++top] = num;
            System.out.println("Element Pushed " + num);
        } else {
            System.out.println("Stack is Full: Overflow");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int val = arr[top];
            top--;
            System.out.println("Popped element is " + val);
            return val;
        } else {
            System.out.println(" Stack is empty: Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(4);
        stack.push(3);
        stack.push(13);
        stack.push(11);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//        stack.push(80);
//        stack.push(100);
        stack.pop();
        stack.pop();
        System.out.println("Peek Element is " + stack.peek());

    }
}
