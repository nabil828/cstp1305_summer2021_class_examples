class Node{
    int data;
    Node next;
    Node(int a){
        data = a;
        next = null;
    }

}

public class DisplayLinkList {
    public static void main(String[] args) {
        Node a = new Node(40);
        Node b = new Node(50);
        Node c = new Node(30);
        Node d = new Node(59);
        Node e = new Node(33);
        Node f = new Node(83);
        a.next = b;
        b.next = c;
        c.next  = d;
        d.next = e;
        d.next.next = f; //another way to say e.next = f

        displayListRecursivelyLastToFirst(a);
    }

    private static void displayListRecursively(Node a) {
        if(a == null) { // basic step - stopping codition
            ;
        }
        else{//recursive step
            System.out.println(a.data);
            displayListRecursively(a.next);

        }
    }

    private static void displayListRecursivelyLastToFirst(Node a) {
        if(a == null) { // basic step - stopping condition
            ;
        }
        else{//recursive step
            displayListRecursivelyLastToFirst(a.next);
            System.out.println(a.data);
        }
    }

    private static void displayListIteratively(Node a) {
        Node iterator = a;
        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
