/*
1. Develop a simple java program that 
shows stack using array. 
Use the following data for 
Push ( 20, 30, 40, 50) Pop ( 50)

2. Develop a simple java program that 
shows stack using array. 
Use the following data for 
Push ( 45, 55, 65, 75) Pop ( 55)
 */
public class PushPop {

    static int size = 4;
    static int[] arr = new int[size];
    static int top = -1;

    public static boolean isFull() {
        return (size - 1 == top);
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static void push(int num) {
        if (!isFull()) {
            arr[++top] = num;
            System.out.println("Push " + num);
        } else {
            System.out.println("Stack is Full: Overflow");
        }
    }

    public static int pop() {
        if (!isEmpty()) {
            int val = arr[top];
            top--;
            System.out.println("Pop " + val);
            return val;
        } else {
            System.out.println(" Stack is empty: Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
//        push(20);
//        push(30);
//        push(40);
//        push(50);
//        pop();

         push(45);
         push(55);
         pop();
         push(65);
         push(75);
        printStack(); // print stack array list
    }

    public static void printStack() {
        System.out.println("\nStack List: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
            size -= 1;
        }
        System.out.println("");
    }
}
