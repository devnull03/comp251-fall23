
public class Main {

    public static void main(String[] args) {
        UnsortedTableMap<String, Integer> map = new UnsortedTableMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "'s age is " + entry.getValue());
        }

        System.out.println("Removed Bob's age: " + map.remove("Bob") );
        map.put("Eva", 40);
        System.out.println("is map empty? " + map.isEmpty());

        System.out.println("Entries in map: ");
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Size of map: " + map.size());

    }

}

