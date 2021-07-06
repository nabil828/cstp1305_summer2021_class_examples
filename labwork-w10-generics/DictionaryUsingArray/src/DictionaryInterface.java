public interface DictionaryInterface <T, V>{
    // the key is the search object for the new entry
    // the value is the associated object with the key
    // if the key exists, you should replace the old value with the new
    // no exceptions
    public void insert(T key, V value);

    // todo add spec
    public void remove(T key);

    // todo add spec
    public void modify(T key, V value);

    // todo add spec
    public V lookup(T key);
}
