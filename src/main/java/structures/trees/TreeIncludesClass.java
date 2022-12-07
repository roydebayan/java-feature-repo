package structures.trees;

public class TreeIncludesClass {
    public boolean includeWithRecursion(Node root, int target){
        if (root == null) return false;
        if (root.data == target) return true;
        return (includeWithRecursion(root.left, target) || includeWithRecursion(root.right, target));
    }
}
