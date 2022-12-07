package ds;

public class LinkList {
    Node head;
    public void insert(int data){
        Node node = new Node(data);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }
    public void show(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void delete(int data){
        Node current = head;
        boolean flag = false;
        while(current.next != null){
            if (current.next.data == data){
                flag = true;
                break;
            }
            current = current.next;
        }
        if (flag) current.next = current.next.next;

    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.show();
        System.out.println(list.head);
        list.delete(4);
        list.show();

    }
}
