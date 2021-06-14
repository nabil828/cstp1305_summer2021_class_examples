public class RecursionFib {

    public static void main(String[] args) {
        System.out.println(fib(23));
    }

    private static int fib(int i) {
        //basic step - stopping condition
        if(i == 1 || i == 0)
            return i;
        else
        //recursive step
            return fib(i - 1) + fib(i-2);
    }
}
