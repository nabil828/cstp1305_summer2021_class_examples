class DoublyNode{
    int data;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(){ // default constructor
        next = null;
        prev = null;
    }
}

public class DeQueueUsingDoublyLinkedLists {
    DoublyNode front;
    DoublyNode back;

    void insertAtBack(int a){

        // 1
        DoublyNode aNode = new DoublyNode();
        aNode.data = a;


        if(front == null){
            // the first node to insert
            front = aNode;
            back = aNode;
        }else{
            //2.a
            back.next = aNode;

            //2.b
            aNode.prev = back;
            // you may interchange 2.a & 2.b

            //2.c
            back = aNode;
        }

    }


    void insertAtFront(int a){
        // 1
        DoublyNode aNode = new DoublyNode();
        aNode.data = a;


        if(front == null){
            // the first node to insert
            front = aNode;
            back = aNode;
        }else{
            //2.a
            front.prev = aNode;

            //2.b
            aNode.next = front;
            // you may interchange 2.a & 2.b

            //2.c
            front = aNode;
        }
    }

    int peekBack(){
        return back.data;
    }
    int peekFront(){
        return front.data;
    }

    void removeFromBack(){
        //1
        back = back.prev;
        //2
        back.next = null;
    }

    void removeFromFront(){
        //1
        front= front.next;
        //2
        front.prev = null;
    }
    public static void main(String[] args) {
        DeQueueUsingDoublyLinkedLists aDeQueue = new DeQueueUsingDoublyLinkedLists();
//        aDeQueue.insertAtFront(5);
//        aDeQueue.insertAtFront(2);
//        aDeQueue.insertAtFront(4);
//        aDeQueue.insertAtFront(10);

        aDeQueue.insertAtBack(10);
        aDeQueue.insertAtBack(4);
        aDeQueue.insertAtBack(2);
        aDeQueue.insertAtBack(5);

//        aDeQueue.removeFromtFront();
//        aDeQueue.removeFromBack();
//        aDeQueue.peekFront();
        aDeQueue.removeFromBack();
        System.out.println(aDeQueue.peekBack()); // 2


    }
}
