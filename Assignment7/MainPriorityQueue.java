import java.util.ArrayList;
import java.util.List;

public class MainPriorityQueue {
    public static void main(String[] args) {
         UnsortedPriorityQueue<Integer, String> priorityQueue = new
        UnsortedPriorityQueue<>();
        
         // Insert elements into the priority queue
         priorityQueue.insert(5, "A");
         priorityQueue.insert(9, "C");
         priorityQueue.insert(3, "B");
        
        List<Entry<Integer, String>> elements = new ArrayList<>();

        // Extract elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            Entry<Integer, String> element = priorityQueue.removeMin();
            elements.add(element);
        }

        if (!elements.isEmpty()) {
            // Print the minimum key and value
            Entry<Integer, String> minEntry = elements.get(0);
            System.out.println("Minimum Key: " + minEntry.getKey() + ", Value: " + minEntry.getValue());
        } else {
            System.out.println("The priority queue is empty.");
        }
        if (!elements.isEmpty()) {
            // Print all keys and values
            for (Entry<Integer, String> entry : elements) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        } else {
            System.out.println("The priority queue is empty.");
        }

        }

         
}
