class Node{
    Pair aPair;

    public Node getNext() {
        return next;
    }

    Node next;

    public void setNext(Node next) {
        this.next = next;
    }


    Node(Pair anotherPair){
        this.aPair = anotherPair;
    }
}

public class DictionaryUsingLinkedList implements DictionaryInterface{
    Node head;

    public void insert(int key, String value){
        Pair aPair = new Pair(key, value);
        Node aNewNode = new Node(aPair);
        if (head == null){
            head = aNewNode;
        }else{
            // the list is not empty
            // insert at the beginning
            aNewNode.setNext(head);
            head  = aNewNode;
        }
    }

    public String lookup(int key){
        Node iterator = head;
        while(iterator != null){
            if(iterator.aPair.key == key){
                return iterator.aPair.value;
            }
            iterator = iterator.getNext();
        }
        return null;
    }

    public void remove(int key){
        if(head.aPair.key == key)
            head = head.getNext();

        Node iterator = head;
        Node prevNode = iterator;
        while(iterator != null){
            if(iterator.aPair.key == key){
               // ? remove
                Node nextNode = iterator.next;
                prevNode.next = nextNode;
            }
            prevNode = iterator;
            iterator = iterator.getNext();
        }
    }

    public void modify(int key, String newValue){
        Node iterator = head;
        while(iterator != null){
            if(iterator.aPair.key == key){
                iterator.aPair.value = newValue ;
            }
            iterator = iterator.getNext();
        }
    }

    public static void main(String[] args) {
        DictionaryUsingLinkedList studentsDictionary = new DictionaryUsingLinkedList();
        studentsDictionary.insert(1, "Nabil");
        studentsDictionary.insert(2989, "Phillip");
        studentsDictionary.insert(3, "Matt");
        studentsDictionary.insert(4, "Yoonseo");
        System.out.println(studentsDictionary.lookup(4));

        System.out.println(studentsDictionary.lookup(2989));
        studentsDictionary.modify(2989, "Danny");
        System.out.println(studentsDictionary.lookup(2989));
        studentsDictionary.remove(2989);
        System.out.println(studentsDictionary.lookup(2989)); // may return null?
    }
}
