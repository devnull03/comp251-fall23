package Assignment4;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main (String[] args){
        ArrayDeque<Pair> a = new ArrayDeque<>();

        Pair P3 = new Pair("Laptop", 2) ;
        Pair P2 = new Pair("Mobile", 3);
        Pair P1 = new Pair("Books", 4);
        Pair P4 = new Pair("Boards", 5);

        a.add(P1);
        a.addFirst(P2);
        a.addFirst(P3);
        a.addLast(P4);

        System.out.print("The contents of Deque are: ");
        for (Pair pair : a) {
            System.out.print(pair + " ");
        }
        
    }
}

class Pair {
    private String first;
    private int second;

    public Pair(String first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
