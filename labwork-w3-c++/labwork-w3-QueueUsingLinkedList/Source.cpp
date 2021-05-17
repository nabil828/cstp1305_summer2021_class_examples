#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node * next;
    Node() {
        next = NULL;
      
    }
};

class QueueUsingLinkList {
public:
    // data members
    Node *front;
    Node *back;


    //member functions
    QueueUsingLinkList() {
        front = NULL;
        back = NULL;
    }

    void insert(int a) {
        if (front == NULL) {
            //empty queue
            // step 1
            Node * newNode = new Node();
            (*newNode).data = a;
            (*newNode).next = NULL;

            //step 2
            front = newNode;
            back = newNode;
        }
        else {
            // step 1
            Node * newNode = new Node();
            (*newNode).data = a;
            (*newNode).next = NULL;

            // step 2
            (*back).next = newNode;

            // step 3
            back = newNode;
        }
    }


    void remove() {
        front = (*front).next;

    }
    int peek() {
        return (*front).data;
    }


};


void main() {
    QueueUsingLinkList *aQueue = new QueueUsingLinkList();
    (*aQueue).insert(34);
    (*aQueue).insert(54);
    (*aQueue).remove();
    (*aQueue).remove();
    (*aQueue).insert(67);
    (*aQueue).insert(98);
    (*aQueue).insert(23);
    (*aQueue).insert(43);
    (*aQueue).insert(12);
    (*aQueue).insert(89);
    (*aQueue).insert(36);
    cout<<(*aQueue).peek(); //this should print 67?

}
