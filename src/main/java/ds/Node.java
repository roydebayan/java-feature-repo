package structures;

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
        Node two = new Node(2);
        Node three = new Node(3);

        one.next = two;
        two.next = three;

        two = null;

        Node counter = one;
        while(counter != null){
            System.out.print(counter + " -> ");
            counter = counter.next;
        }
        System.out.println("null");

        // one -> two -> three

        System.out.println("----------------------------");








    }
}
