
class Stack {

    public static int SIZE = 4;
    public static int top = 0;

    public static int[] S = new int[SIZE + 1];

    public static boolean isEmpty() {
        if (top == 0) {
            return true;
        }
        return false;
    }

    public static void push(int x) {
        top = top + 1;
        if (top > SIZE) {
            System.out.println("Stackoverflow");
        } else {
            S[top] = x;
        }
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stackunderflow");
            return -1000;
        } else {
            top = top - 1;
            return S[top + 1];
        }
    }

    public static void main(String[] args) {
        push(20);
        push(30);
        push(40);
        push(50);

        pop();

        for (int i = 1; i <= SIZE; i++) {
            System.out.println(S[i]);
        }
    }
}
