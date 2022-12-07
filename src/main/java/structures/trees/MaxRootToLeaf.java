package structures.trees;


import java.util.List;

public class MaxRootToLeaf {
    public int current = 0;
    public int getCurrent() {
        return current;
    }
    public void findMaxSumPath(Node root, int sum) {
        if (root == null) return;
        sum = sum + root.data;
        if (root.left == null) {
            if (sum > current) current = sum;
        } else findMaxSumPath(root.left, sum);
        if (root.right == null) {
            if (sum > current) current = sum;
        } else findMaxSumPath(root.right, sum);
    }

}
