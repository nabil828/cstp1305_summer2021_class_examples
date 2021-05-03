#include<iostream>
using namespace std;
class MyStack{
	// This this thee ADT specification: "WHAT"
	//A stack should implement at least the first two of these operations :
	// push – insert an item at the top of the stack
	//	pop – remove and return the top item
	//	peek – return the top item

private:
	// 1- data members
	int arr[100]; //later on, this will cause some problems 
	int top; // declaration


public:
	// 2- member functions
	void push(int a) {
		arr[top + 1] = a;
		top++; // will actually move the top to the 'top' of the stack
	}
	int pop() {
		int tmp = arr[top];
		top--; //remove
		return tmp;	
	}
	int peek() {
		return arr[top];
	}

	MyStack() {
		top = -1;
	}
};

int main(){
	cout << "Hi, This is the first code"<<endl;
	MyStack aStack; // int x;
	aStack.push(1);
	aStack.push(7);
	aStack.push(2);
	aStack.push(5);
	aStack.pop(); //this will remove 5
	aStack.push(4); // now the top of the stack is 4
	cout<< aStack.peek(); // this should print 4
	return 0;
}