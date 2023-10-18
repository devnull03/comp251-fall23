package Assignment4;

import java.util.Stack;

public class Main {
    static Stack<Integer> S = new Stack<Integer>();
    static Stack<Integer> T = new Stack<Integer>();
        public static void main(String[] args) {

    S.push(1);
    S.push(2);
    S.push(3);
    S.push(4);
    S.push(5);
   
    stacksAdvanced.transfer(S, T);

     System.out.println(S);
     System.out.println(T);
    }

  

}





