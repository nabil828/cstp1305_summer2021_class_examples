

public class DictionaryUsingArray {

    Pair [] arr = new Pair [10];
    int last;

    DictionaryUsingArray(){
        last = 0;
    }
    void insert(int key , String value){
            arr[last] = new Pair(key, value);
            last++;
    }

    void remove(int key){
        // 1 - find the index of the provided key
        int i;
        for( i = 0 ; i < last; i++){
            if(arr[i].key == key)
                break;
        }
        // 2- swap the value of that index with the value of the last index
        arr[i].key = arr[last - 1].key;
        arr[i].value = arr[last - 1].value;

        // 3- decrement last by 1
        last--;
    }

    String lookup ( int key){
        for( int i = 0 ; i < last; i++){
            if(arr[i].key == key)
                return arr[i].value;
        }
        return null;
    }

    void modify(int key, String value){
        for( int i = 0 ; i < last; i++) {
            if (arr[i].key == key)
                arr[i].value = value;
        }
    }
    public static void main(String[] args) {
        DictionaryUsingArray studentsDictionary = new DictionaryUsingArray();
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
