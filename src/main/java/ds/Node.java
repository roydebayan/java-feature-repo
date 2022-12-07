package ds;

public class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    }
    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(2);
        one.next.next = new Node(3);

        Node head = one;

        Node counter = head;
        counter.next = counter.next.next;

        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");




    }

}
