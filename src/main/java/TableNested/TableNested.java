package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K key){
        V value = null;
        Entry<K, V> entry = getEntry(key);
        if (entry == null){
            return null;
        }
        value = entry.getValue();
        return value;
    }

    public void put(K key, V value){
        Entry<K, V> entryToAdd = new Entry<>(key, value);
        entries.add(entryToAdd);
    }

    public void remove(K key){
        Entry<K, V> entryToRemove = getEntry(key);
        entries.remove(entryToRemove);
    }

    public Entry getEntry(K key){
        Entry entryToReturn = null;
        for (Entry<K,V> entry: entries){
            if (entry.getKey().equals(key)){
                entryToReturn = entry;
            }
        }
        return entryToReturn;
    }

     class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }

}
