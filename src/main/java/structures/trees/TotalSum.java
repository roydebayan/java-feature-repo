package structures.trees;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TotalSum {

    public int totalSum(Node root){
        if (root == null) return 0;
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);


        return root.data + totalSum(root.left) + totalSum(root.right);
    }
    public int totalWithStack(Node root){
        Stack<Node> stack = new Stack<>();
        if (root == null) return 0;
        stack.push(root);
        int result = 0;
        while(!stack.empty()){
            Node pop = stack.pop();
            result = result + pop.data;
            if (pop.left != null) stack.push(pop.left);
            if (pop.right != null) stack.push(pop.right);
        }
        return result;
    }
}
