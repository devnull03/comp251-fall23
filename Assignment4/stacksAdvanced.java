package Assignment4;

import java.util.Stack;

public class stacksAdvanced {
    public static void transfer(Stack<Integer> S, Stack<Integer> T) {

        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}
