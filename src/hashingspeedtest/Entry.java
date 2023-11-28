package hashingspeedtest;

final class Entry<K, V> {

    private K key;
    private V value;
    private States state;
    
    private enum States {CURRENT, REMOVED} 

    protected Entry(K searchKey, V dataValue) {
        key = searchKey;
        value = dataValue;
        state = States.CURRENT;
    } 

    protected K getKey() {
        return key;
    } 

    protected V getValue() {
        return value;
    } 

    protected void setValue(V newValue) {
        value = newValue;
    } 

    // Returns true if this entry is in the hash table.
    protected boolean isIn() {
        return state == States.CURRENT;
    } 

    // Returns true if this entry was removed from hash table.
    protected boolean isRemoved() {
        return state == States.REMOVED;
    } 

    // Sets the state of this entry to removed.
    protected void setToRemoved() {
        key = null;
        value = null;
        state = States.REMOVED; 
    } 
} 

