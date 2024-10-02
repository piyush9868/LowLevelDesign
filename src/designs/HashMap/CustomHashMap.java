package designs.HashMap;

public class CustomHashMap<K, V>{

    int MAX_SIZE = 1<<30;
    Entry<K,V>[] entries;

    CustomHashMap(){
        entries = new Entry[MAX_SIZE];
    }

    static class Entry<K, V>{
        K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value){
        int hash = key.hashCode() % MAX_SIZE;
        if(entries[hash] == null){
            entries[hash] = new Entry<>(key, value);
        }
    }

//    public V get(K key){
//
//    }
}
