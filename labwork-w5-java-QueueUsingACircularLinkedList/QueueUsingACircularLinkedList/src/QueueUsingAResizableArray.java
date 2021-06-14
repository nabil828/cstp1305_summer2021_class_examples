public class QueueUsingAResizableArray {

    // Data members
    int[] arr = new int[1]; // later on, we will talk about array enlargement
    int front;
    int back;

    void resize(){
        // is to create a new LARGER array
        int [] new_arr = new int[arr.length + 2];
        // is to copy the old element to this newly created array
        for(int i = 0; i < arr.length;i++){
            new_arr[i] = arr[i];
        }
        // to set the old arr to the new array
        arr = new_arr;
    }
    public QueueUsingAResizableArray() {
        front = 0;
        back = 0;
    }

    // Member Functions
    //    insert – insert item at the back of the queue
    void insert(int a) {
        // check if you have a space.
        // IF you don't you have to resize the array
        resize();
        arr[back] = a;
        back = (back + 1) % 8;

    }


    //    peek – return the item at the front of the queue without removing it
    int peek() {
        return arr[front];
    }

    //    remove – remove an item from the front
    void remove() {
        front = (front + 1) % 8;
    }

    public static void main(String[] args) {
        QueueUsingAResizableArray aQueue = new QueueUsingAResizableArray();
        aQueue.insert(34);
        aQueue.insert(54);
        aQueue.remove();
        aQueue.remove();
        aQueue.insert(67);
        aQueue.insert(98);
        aQueue.insert(23);
        aQueue.insert(43);
        aQueue.insert(12);
        aQueue.insert(89);
        aQueue.insert(36);
        System.out.println(aQueue.peek()); //this should print 67?


    }


}
