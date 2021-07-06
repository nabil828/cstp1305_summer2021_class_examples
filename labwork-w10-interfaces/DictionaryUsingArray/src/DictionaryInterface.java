public interface DictionaryInterface {
    // the key is the search object for the new entry
    // the value is the associated object with the key
    // if the key exists, you should replace the old value with the new
    // no exceptions
    public void insert(int key, String value);

    // todo add spec
    public void remove(int key);

    // todo add spec
    public void modify(int key, String value);

    // todo add spec
    public String lookup(int key);
}
