package structures.linkedlist;

public class Stack {
    public Node top;
    public Stack() {
        top = null;
    }


    public void push(int integer){
        Node node = new Node(integer);
        if (top == null){
            top = node;
            return;
        }
        node.next = top;
        top = node;
    }

    public int pop(){
        if (top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int result = top.data;
        top = top.next;
        return result;
    }
    public void first(){
        if (top == null) System.out.println("The stack is empty");
        else System.out.println(top.data);
    }

    public void show(){
        Node current = top;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.first();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(55);
        stack.show();
        int pop = stack.pop();
        System.out.println("pop = " + pop);
        stack.show();
        stack.first();

    }
}
