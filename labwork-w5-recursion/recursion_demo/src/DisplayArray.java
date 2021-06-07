public class DisplayArray {

    public static void main(String[] args) {

        int []arr = new int[6];
        arr[0] = 40;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 59;
        arr[4] = 33;
        arr[5] = 83;


//        displayArrayRecursive(arr, 0, arr.length -1);
        displayArrayRecursiveMiddleFirstNextRightThenLeft(arr, 0, arr.length -1 );
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

    private static void displayArrayRecursiveLastToFirst(int [] arr, int last_index){
        System.out.println("Item: " + arr[last_index]);
        if (last_index != 0) {
            displayArrayRecursiveLastToFirst(arr, last_index - 1);
        }
    }

    private static void displayArrayRecursiveMiddleFirstNextLeftThenRight(int [] arr, int first_index, int last_index){
        if( last_index < first_index){
            ;
        }else if( first_index == last_index){
            System.out.println(arr[first_index]);
        }else{
            int middle_index = ( first_index + last_index ) / 2;
            System.out.println(arr[middle_index]);

            displayArrayRecursiveMiddleFirstNextLeftThenRight(arr, first_index, middle_index - 1);
            displayArrayRecursiveMiddleFirstNextLeftThenRight(arr, middle_index + 1, last_index);
        }

    }

    private static void displayArrayRecursiveMiddleFirstNextRightThenLeft(int [] arr, int first_index, int last_index){
        if( last_index < first_index){
            ;
        }else if( first_index == last_index){
            System.out.println(arr[first_index]);
        }else{
            int middle_index = ( first_index + last_index ) / 2;
            System.out.println(arr[middle_index]);

            displayArrayRecursiveMiddleFirstNextRightThenLeft(arr, middle_index + 1, last_index);
            displayArrayRecursiveMiddleFirstNextRightThenLeft(arr, first_index, middle_index - 1);
        }

    }
}
