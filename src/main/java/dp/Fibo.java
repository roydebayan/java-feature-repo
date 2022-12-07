package dp;

public class Fibo {

    public static int function(int integer){
        if (integer <=2) return 1;
        return function(integer-1) + function(integer-2);
    }

    public static void main(String[] args) {
        int function = function(20);
        System.out.println("function = " + function);
    }
}
