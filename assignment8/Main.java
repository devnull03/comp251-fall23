import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 45);

        System.out.println(map.get("Alice"));

    }

}

