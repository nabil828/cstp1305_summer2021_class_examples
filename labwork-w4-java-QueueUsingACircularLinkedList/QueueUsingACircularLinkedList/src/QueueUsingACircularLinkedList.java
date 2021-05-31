import java.util.EmptyStackException;

class Node{
    int data;
    Node next;
    Node(){
        next = null;

    }
}

class EmptyQeueueException extends Exception{
    public EmptyQeueueException(String e){
        super(e);
    }
}

public class QueueUsingACircularLinkedList {
    Node front;
    Node back;
    void insert(int a){ // enqueue
        // 1
        Node aNewNode= new Node();
        aNewNode.data = a;

        if(front == null){ // or back == null
            // the Q is empty
            //step 1
            front = aNewNode;
            back = aNewNode;
            //step 2
            aNewNode.next= aNewNode;
        }else{
            //2.a
            back.next = aNewNode;
            //2.b
            back = aNewNode;

            //3
            back.next = front;
        }

    }
    int peek () throws EmptyQeueueException{
        if(front == null){
            // this means that the Q is empty
            throw new EmptyQeueueException("Oh! you can't do this. make sure that you have some elements first!");
        }
        return front.data; // BUT, what if there was no elements!?
        // 1 - is to always return special value like -1. this is not good because -1 could be one of the valids element
        // or 2- is to return null (dangerous)
        //or 3- we can raise an exception! ^_-
        // or 4- println() // why this also bad
    }

    void remove(){ // the same as dequeue
        if(front == back ) // this is the case in which you only have one node in the Q
        {
            front = null;
            back = null;

        }else{
            // step 1
            front = front.next;
            // step 2
            back.next = back;
        }
    }


    public static void main (String[] args) {
        QueueUsingACircularLinkedList aQueue = new QueueUsingACircularLinkedList();
        aQueue.insert(34);
        aQueue.insert(54);
        aQueue.remove();
        aQueue.remove();
        try {
            System.out.println(aQueue.peek()); //this should print 67?
        }
        catch (EmptyQeueueException obj){
            System.out.println(obj.getMessage());
        }
    }
}
