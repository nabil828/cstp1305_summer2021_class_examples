public class DictionaryUsingHashing {
    HashTableLocation[] arr;

    DictionaryUsingHashing() {
        arr = new HashTableLocation[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new HashTableLocation();
        }
    }

    int hashCode(String stringKey) {
        int hash = 0;
        int n = stringKey.length();
        for (int i = 0; i < n; i++) {
            hash = 31 * hash + stringKey.charAt(i);
        }
        return hash;
    }

    int getHash(String key) {
        return hashCode(key) % arr.length;
    }


    // this methods implements linear probing
    // this method retuns the index of the provide @key
    // or it return the first available index for this key
    int probe(String key) {
        int index = getHash(key);
        int result = -1;

        // searching
        boolean found = false;
        int iterator = index;
        int availableStateIndex = -1;
        while (!found && arr[iterator].status != Occupancy.Empty) {
            if (arr[iterator].status == Occupancy.Occupied) {
                if (arr[iterator].key == key) {
                    found = true;
                    result = iterator;
                } else {
                    iterator = (iterator + 1) % arr.length;
                }
            }
            if (arr[iterator].status == Occupancy.Empty) {
                // it is not occupied
                // it could be empty
                result = iterator;
                found = true;
            }

            if (arr[iterator].status == Occupancy.Available) {
                // it is not occupied
                // it could be available
                availableStateIndex = iterator;
                iterator = (iterator + 1) % arr.length;
            }
        }
        if (found)
            return result;
        else if (availableStateIndex != -1)
            return availableStateIndex;
        else
            return index;

    }


    public void insert(String key, String value) {
        int index = probe(key);
        arr[index] = new HashTableLocation(key, value);
        arr[index].setStatus(Occupancy.Occupied);

    }

    public void remove(String key) {
        // See if it there
        int index = probe(key);
        if (arr[index].getStatus() == Occupancy.Occupied)
            arr[index].setStatus(Occupancy.Available);
    }

    // raise an exception if the key is not there
    public String lookup(String key) throws KeyNotFoundException {
        int index = probe(key);
        if (arr[index].getStatus() == Occupancy.Occupied)
            return arr[index].getValue();
        else
            throw new KeyNotFoundException("Your Key was not found");
    }

    // raise an exception if the key is not there
    public void modify(String key, String value) throws KeyNotFoundException {
        int index = probe(key);
        if (arr[index].getStatus() == Occupancy.Occupied)
            arr[index].setValue(value);
        else
            throw new KeyNotFoundException("Your Key was not found");
    }

    public static void main(String[] args) {
        try {
            DictionaryUsingHashing studentsDictionary = new DictionaryUsingHashing();
            studentsDictionary.insert("213", "Nabil");
            studentsDictionary.insert("453", "Phillip");
            studentsDictionary.insert("324", "Matt");
            studentsDictionary.insert("456", "Yoonseo");
            studentsDictionary.insert("745", "Danny");
            studentsDictionary.insert("345", "Jack1");
            studentsDictionary.insert("874", "Jack2");
            studentsDictionary.insert("983", "Jack3");
            studentsDictionary.insert("945", "Jack4");
            System.out.println(studentsDictionary.lookup("4"));

            System.out.println(studentsDictionary.lookup("2989"));
            studentsDictionary.modify("2989", "Danny");
            System.out.println(studentsDictionary.lookup("2989"));
            studentsDictionary.remove("2989");
            System.out.println(studentsDictionary.lookup("2989")); // may return null?
        } catch (KeyNotFoundException obj) {
            System.out.println(obj.getMessage());
        }
    }
}
