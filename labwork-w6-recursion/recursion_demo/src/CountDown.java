public class CountDown {
    //print a till 1 and stop
    static void countRecursive(int a){
        if( a == 0 ){ // stopping condition
               ;
        }else{ // recursive step
            System.out.println(a);
            countRecursive(a - 1);
        }
    }


    //print a till 1 and stop
    static void countTailRecursive(int a){
        if( a >= 1) {
            System.out.println(a);
            countRecursive(a - 1);
        }
    }

    //iterative solution of count down
    static void countIterative(int a){
        while (a >= 1){
            System.out.println(a);
            a = a - 1;
        }
    }


    public static void main(String[] args) {
//        countIterative(10);
        int []arr = new int[3];
        arr[0] = 40;
        arr[1] = 50;
        arr[2] = 30;
//        displayArrayRecursive(arr, 0, arr.length -1);
        displayArrayIterative(arr);
    }

    private static void displayArrayRecursive(int[] arr, int start_index, int last_index) {
        // basic step
        System.out.println(arr[start_index]);

        if(start_index < last_index) //stopping condition
            //recursive step
            displayArrayRecursive(arr, start_index +1, last_index);
    }

    private static void displayArrayIterative(int [] arr){
        for (int i =0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
