package structures.linkedlist;

public class Queue {
    Node head;
    Node tail;
    public Queue(){
        head = tail = null;
    }

    public void push(int integer){
        Node node = new Node(integer);
        if (head == tail && head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }
    public void pop(){
        if (head == tail && head == null){
            System.out.println("The queue is empty");
            return;
        }
        if (head == tail){
            System.out.println("Popped: " + head.data);
            head = tail = null;
            return;
        }
        int result = head.data;
        head = head.next;
        System.out.println("Popped: " + result);
    }


}
