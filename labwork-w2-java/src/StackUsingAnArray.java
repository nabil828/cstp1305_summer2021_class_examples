// This this thee ADT specification: "WHAT"
//A stack should implement at least the first two of these operations :

public class StackUsingAnArray {
    int [] arr = new int[100]; // declare in java
    // arr variable here is an object
    // the new operator is always used whenever you try to initialize an object.

    int top;

    StackUsingAnArray(){
        top = -1;
    }

    // push – insert an item at the top of the stack
    void push(int a) {
        arr[top + 1] = a;
        top++; // will actually move the top to the 'top' of the stack
    }

    //	pop – remove and return the top item
    int pop() {
        int tmp = arr[top];
        top--; //remove
        return tmp;
    }

    //	peek – return the top item
    int peek() {
        return arr[top];
    }

    public static void main(String args[]){
        StackUsingAnArray aStackObject = new StackUsingAnArray();

        aStackObject.push(1);
        aStackObject.push(7);
        aStackObject.push(2);
        aStackObject.push(5);
        aStackObject.pop(); //this will remove 5
        aStackObject.push(4); // now the top of the stack is 4
        System.out.println(aStackObject.peek()); // this should print 4

    }
}
