public class QueueUsingCircularArrays {
    // Data members
    int [] arr = new int[8]; // later on, we will talk about array enlargement
    int front;
    int back;

    public QueueUsingCircularArrays(){
        front = 0;
        back = 0;
    }

    // Member Functions
    //    insert – insert item at the back of the queue
    void insert(int a){
        arr[back] = a;
        back = (back + 1) % 8;

    }


    //    peek – return the item at the front of the queue without removing it
    int peek(){
        return arr[front];
    }

    //    remove – remove an item from the front
    void remove(){
        front = (front + 1) % 8;
    }

    public static void main(String[] args) {
        QueueUsingCircularArrays aQueue = new QueueUsingCircularArrays();
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


