

public class DictionaryUsingArray<T,V> implements DictionaryInterface<T,V>{

    Pair<T,V> [] arr = new Pair[10];
    int last;

    DictionaryUsingArray(){
        last = 0;
    }

    public void insert(T key , V value){
            arr[last] = new Pair<T,V>(key, value);
            last++;
    }

    public void remove(T key){
        // 1 - find the index of the provided key
        int i;
        for( i = 0 ; i < last; i++){
            if(arr[i].key.equals(key))
                break;
        }
        // 2- swap the value of that index with the value of the last index
        arr[i].key = arr[last - 1].key;
        arr[i].value = arr[last - 1].value;

        // 3- decrement last by 1
        last--;
    }

    public V lookup ( T key){
        for( int i = 0 ; i < last; i++){
            if(arr[i].key.equals(key))
                return (V)arr[i].value;
        }
        return null;
    }

    public void modify(T key, V value){
        for( int i = 0 ; i < last; i++) {
            if (arr[i].key.equals(key))
                arr[i].value = value;
        }
    }
    public static void main(String[] args) {
        DictionaryInterface<Integer, String> studentsDictionary = new DictionaryUsingArray<>();
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
