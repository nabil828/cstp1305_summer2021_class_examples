public class Searching {
    public static void main(String[] args) {
        int []arr = new int[7];
        arr[0] = 20;
        arr[1] = 50;
        arr[2] = 59;
        arr[3] = 61;
        arr[4] = 73;
        arr[5] = 83;
        arr[6] = 90;

        System.out.println(binary_search_recursive(arr, 0, arr.length - 1, 72));
    }

    private static int binary_search_recursive(int[] arr, int start_index, int last_index, int target) {

        int middle_index = (start_index + last_index)/2;
        if(start_index > last_index){ // for later
            return -1;
        }else if(target == arr[middle_index])
            return middle_index;
        else if (target > arr[middle_index])
        {
            // then your target is at the right half of the array
            return binary_search_recursive(arr, middle_index + 1, last_index, target);
        }else{
            // then your target is at the left half of the array
            return binary_search_recursive(arr, start_index, middle_index - 1, target);
        }

    }

    //return the index of the target. -1 if the target does not exist
    private static int linear_search_iterative(int []arr, int target) {
        for(int i = 0; i < arr.length; i++ ){
            if(target == arr[i])
                return i;
        }
        return  -1;
    }


}
