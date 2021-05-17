public class PriorityQueueUsingArray {
    // Data members
    int [] arr  = new int[8];
    int last_index;

    PriorityQueueUsingArray(){
        last_index = -1;
    }
    void insert (int a ){
        last_index = last_index + 1;
        arr[last_index] = a;

    }

    void remove(){
        // 1 - find the item with the most priority; the item with lowest integer value
        int min = Integer.MAX_VALUE;// 23187182746871
        int min_index = -1;

        for (int i = 0; i < last_index; i++){
            if (arr[i] <= min){
                min = arr[i];
                min_index = i;
            }
        }

        // 2 - remove it!
        // 2.1 - swap the min_index with the last element
        swap(min_index, last_index, arr);
        // 2.2 - decrement last_index by 1
        last_index --;
    }

    void swap(int index1 , int index2, int []arr){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    int peek(){
        // 1 - find the item with the most priority; the item with lowest integer value
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int i = 0; i < last_index; i++){
                if (arr[i] <= min){
                    min = arr[i];
                    min_index = i;
                }
        }
        // 2- return the min
        return min;
    }

    public static void main(String[] args) {
        PriorityQueueUsingArray aPriorityQueue = new PriorityQueueUsingArray();
        aPriorityQueue.insert(5);
        aPriorityQueue.insert(3);
        aPriorityQueue.insert(2);
        aPriorityQueue.insert(6);
        aPriorityQueue.insert(1);
        aPriorityQueue.insert(4);
        System.out.println(aPriorityQueue.peek()); //this should print 1
        aPriorityQueue.remove();
        System.out.println(aPriorityQueue.peek()); //this should print 2
    }
}
