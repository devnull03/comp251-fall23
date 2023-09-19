public class Pair<K,V>{
public K key;
public V value;

public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("age", 25);
       Pair<String, String> pair2 = new Pair<>("name", "John");
        Pair<Integer, Double> pair3 = new Pair<>(100, 99.5);

        Pair<?, ?>[] pairs = { pair1, pair2, pair3 };
        for (Pair<?, ?> pair : pairs) {
            System.out.println(pair);
        }

    }

}
