class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class StackUSingALinkedList {
    Node top;

    StackUSingALinkedList(){
        top = null;
    }
    // push – insert an item at the top of the stack
    void push(int a) {
        // first step: is to create a new Node
        Node newNode = new Node(a);
        newNode.next = null;

        // second step: is to check whether the linked is empty or not
        if(top == null) {
            // it is empty
            top = newNode;
        }else{
            // it is not empty
            newNode.next = top;
            top = newNode;
        }

    }

    //	pop – remove and return the top item
    int pop() {
        int tmp = top.data;
        top = top.next; // how to remove an item from the linked list in Java
        return tmp;
    }

    //	peek – return the top item
    int peek() {
        return top.data;
    }

    public static void main (String args[]){
        StackUSingALinkedList aStackObject = new StackUSingALinkedList();

        aStackObject.push(1);
        aStackObject.push(7);
        aStackObject.push(2);
        aStackObject.push(5);
        aStackObject.pop(); //this will remove 5
        aStackObject.push(4); // now the top of the stack is 4
        System.out.println(aStackObject.peek()); // this should print 4


    }
}
