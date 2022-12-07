package structures.linkedlist;

public class LinkList {
    Node head;
    public LinkList(){
        head = null;
    }
    public void show(){
        if (head == null){
            System.out.println("The link list is empty");
        }else{
            Node current = head;
            while(current.next != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print(current.data + " -> null");

        }
        System.out.println("  ");
        System.out.println("-------------------------------------------------");

    }
    public void addFirst(int integers){
        Node node = new Node(integers);
        node.next = head;
        head = node;
    }
    public void addLast(int integer){
        Node node = new Node(integer);
        if (head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public void delete(int integer){
        if (head.data == integer){
            head = head.next;
            return;
        }

        Node current = head;
        boolean flag = false;
        while(current.next != null){
            if (current.next.data == integer){
                flag = true;
                break;
            }
            current = current.next;
        }
        if (flag) current.next = current.next.next;
        else System.out.println("Integer is not present in the list.");
    }



    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(5);
        list.addLast(6);
        list.addFirst(4);
        list.show();
        list.delete(4);
        list.show();

    }



}
