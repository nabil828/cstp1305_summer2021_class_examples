public class InsertionSort {
    static void insertionSort(int []arr, int size){
        for(int i = 1; i < size; i++){
            int temp = arr[i];
            int position = i;
            while( position > 0 && arr[position - 1 ] > temp ){
                arr[position] = arr[position - 1];
                position --;
            }
            arr[position] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr= new int[8];
        arr[0] = 23;
        arr[1] = 41;
        arr[2] = 33;
        arr[3] = 81;
        arr[4] = 7;
        arr[5] = 19;
        arr[6] = 11;
        arr[7] = 45;
        insertionSort(arr, 8);
        for(int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
