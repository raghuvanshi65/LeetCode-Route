class MyHashMap {

    private class Node {
        int key;
        int val;

        Node(int key , int val) {
            this.key = key;
            this.val = val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    private ArrayList<Node> list ;

    /** Initialize your data structure here. */
    public MyHashMap() {
        list = new ArrayList<>();
    }

    private int isPresent(int key) {
        for (int i = 0 ; i < list.size() ; i++)
            if (list.get(i).getKey() == key )
                return i;

        return -1;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = isPresent(key);
        if (index != -1)
            list.set(index , new Node(key , value));
        else
            list.add(new Node(key , value));

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = isPresent(key);
        return index != -1 ? list.get(index).getVal() : -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = isPresent(key);
        if (index != -1)
            list.remove(index);
    }
}