class Node{
    int data;
    Node next;
    Node(){
        next = null;

    }
}

public class QueueUsingLinkList {

    // data members
    Node front;
    Node back;


    //member functions
    QueueUsingLinkList(){
        front = null;
        back = null;
    }

    void insert(int a){
        if(front == null){
            //empty queue
            // step 1
            Node newNode = new Node();
            newNode.data = a;
            newNode.next = null;

            //step 2
            front = newNode;
            back = newNode;
        }else {
            // step 1
            Node newNode = new Node();
            newNode.data = a;
            newNode.next = null;

            // step 2
            back.next = newNode;

            // step 3
            back = newNode;
        }
    }


    void remove(){
        front = front.next;

    }
    int peek(){
        return front.data;
    }

    public static void main(String[] args) {
        QueueUsingLinkList aQueue = new QueueUsingLinkList();
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
