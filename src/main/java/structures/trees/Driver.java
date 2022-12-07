package structures.trees;

public class Driver {
    public static void main(String[] args) {
        Node root = new Node(5);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node six = new Node(6);
        Node seven = new Node(7);
        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        two.left = six;
        two.right = seven;
        BinaryTree binaryTree = new BinaryTree();
        TreeIncludesClass treeIncludesClass = new TreeIncludesClass();
//        System.out.println(treeIncludesClass.includeWithRecursion(root,3));
//        TotalSum totalSum = new TotalSum();
//        System.out.println(totalSum.totalSum(root));
//        System.out.println(totalSum.totalWithStack(root));
        MaxRootToLeaf maxRootToLeaf = new MaxRootToLeaf();

        System.out.println("current = " + maxRootToLeaf.getCurrent());
        int sum = 0;
        maxRootToLeaf.findMaxSumPath(root,sum);
        System.out.println("current = " + maxRootToLeaf.getCurrent());
    }

}
