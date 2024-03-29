public class LinkedListStack {
    
    Node head;
    
    class Node {
        int value;
        Node next;
    }
    LinkedListStack() {
        head = null;
    }
    public void push(int value) {
        Node extraHead = head;
        head = new Node();
        head.value = value;
        head.next = extraHead;
    }
    public int pop() {
        if(head==null) {
            System.out.println("Stack is empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }
    public static void main(String[] args) {
       LinkedListStack lls = new LinkedListStack();
       
       lls.push(50);
       lls.push(60);
       lls.push(70);
       lls.push(80);

       lls.push(100);

       lls.printList();

    }
    public void printList() {
        Node list = head;
            while(list != null) {
                System.out.println(list.value);
                list = list.next;
            }
    }



//    lls.printList();
//    https://java2blog.com/implement-stack-using-linked-list-in-java/
//    public static void printList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.format("\n%d ", temp.value);
//            temp = temp.next;
//        }
//        System.out.println();
//    }
    
}
