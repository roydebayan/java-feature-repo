package structures.stack;

import ds.Node;

import java.util.EmptyStackException;

public class  Stack {
    Node top;
    public Stack(int data){
        this.top = new Node(data);
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(Node node){
        node.next = top;
        top = node;
    }
    public int pop(){

            if (top == null) throw new EmptyStackException();
            else {
                int result = top.data;
                top = top.next;
                return result;
            }
    }

    public static void main(String[] args) throws Exception {
        Stack myStack = new Stack(5);
        int pop = myStack.pop();
        System.out.println("pop = " + pop);
        int pop1 = myStack.pop();
        System.out.println("pop1 = " + pop1);
    }
}
