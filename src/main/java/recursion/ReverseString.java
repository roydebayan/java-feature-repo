package recursion;

import java.util.Stack;

public class ReverseString {
    public void reverseIt(String string){
        Stack<Character> stack = new Stack<>();
        for (Character value : string.toCharArray()){
            stack.push(value);
        }
        System.out.println(" = ");
        while(!stack.isEmpty()){
            Character pop = stack.pop();
            System.out.print(pop);
        }
    }
    public String reverseString(String string){
        if (string.isBlank()){
            return "";
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
//        reverseString.reverseIt("Hello");
//        String world = reverseString.reverseString("World");
//        System.out.println("world = " + world);
        String string = "Raj";
        String s = reverseString.reverseString(string);
        System.out.println("s = " + s);


    }
}
