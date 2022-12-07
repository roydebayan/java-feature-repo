package structures.trees;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
