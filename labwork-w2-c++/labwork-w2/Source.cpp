#include <iostream>

using namespace std;

class Node {
private:
   
public:
    int data;
    Node * next; //declare a pointer

    Node(int data) {
        (*this).data = data; // derefrercning a pointer 
    }
};

class StackUSingALinkedList {
    Node * top;

public:
    StackUSingALinkedList() {
        top = NULL;
    }

    void push(int a) {
        // first step: is to create a new Node
        Node * newNode = new Node(a);
        newNode->next = NULL;

        // second step: is to check whether the linked is empty or not
        if (top == NULL) {
            // it is empty
            top = newNode;
        }
        else {
            // it is not empty
            (*newNode).next = top; // another way to deference 
                                    // the smae as newNode->next = top; 
            top = newNode;
        }

        //delete newNode;
    }

    //	pop – remove and return the top item
    int pop() {
        int tmp = top->data;
        if (top != NULL) {
            // it is not empty
            Node * tmpPointer = top;

            top = top->next; // how to remove an item from the linked list in Java
            delete tmpPointer;
            return tmp;
           
        }
        else {
            // it is empty
            //top = top->next; // how to remove an item from the linked list in Java
            return -1;
        }

            
    }

    //	peek – return the top item
    int peek() {
        return top->data;
    }

    //destructor
    ~StackUSingALinkedList() {
        while (top != NULL)
            pop();
    }

};


int main() {
    StackUSingALinkedList * aStackObject = new StackUSingALinkedList();

    aStackObject->push(1);
    aStackObject->push(7);
    aStackObject->push(2);
    aStackObject->push(5);
    aStackObject->pop(); //this will remove 5
    aStackObject->push(4); // now the top of the stack is 4
    cout << aStackObject->peek(); // this should print 4

    delete aStackObject;
}