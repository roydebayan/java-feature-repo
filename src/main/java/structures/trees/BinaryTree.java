package structures.trees;

import java.util.*;


public class BinaryTree {
    public List<Integer> depthFirst(Node root){
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root == null) return result;
        stack.push(root);
        while(!stack.empty()){
            Node pop = stack.pop();
            result.add(pop.data);
            System.out.println("Popped Data: " + pop);
            if (pop.right != null){
                stack.push(pop.right);
            }
            if (pop.left != null){
                stack.push(pop.left);
            }
        }
        return result;
    }
    public int[] depthFirstSearch(Node root){
        if (root == null) return new int[]{};
        int[] result = {root.data};
        int[] first = depthFirstSearch(root.left);
        int[] second = depthFirstSearch(root.right);
        int[] finalResult = new int[result.length + first.length + second.length];
        int counter = 0;
        finalResult[counter++] = result[0];
        for (int j : first) {
            finalResult[counter++] = j;
        }
        for (int j : second) {
            finalResult[counter++] = j;
        }
        return finalResult;
    }
    public void breathFirstSearch(Node root){
        if (root == null) return;
//        System.out.println(root.data);
        System.out.println(root.left);
        System.out.println(root.right);
        breathFirstSearch(root.left);
        breathFirstSearch(root.right);
    }

}


