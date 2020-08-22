import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class F1Exercise {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }
    }

    public static void main(String[] args) {

        printFooBarBaz();

        System.out.println(reverseCharacters("the cat is fat"));
        System.out.println(reverseCharacters("band camp is great!"));

        ArrayList<Integer> F1Numbers = new ArrayList<Integer>();
        F1Numbers.add(1);
        F1Numbers.add(2);
        F1Numbers.add(3);
        F1Numbers.add(4);
        F1Numbers.add(5);
        F1Numbers.add(6);
        F1Numbers.add(7);

        System.out.println(F1Numbers);
        System.out.println("Root of Balanced Binary Tree: " + balancedTree( F1Numbers).getVal());

    }

    public static void printFooBarBaz() {
        for ( int i = 1; i <= 100; i += 1){
            if ( i % 2 == 0 && i % 3 == 0) {
                System.out.println( "baz" );
            } else if ( i % 2 == 0) {
                System.out.println( "foo" );
            } else if ( i % 3 == 0) {
                System.out.println( "bar");
            } else {
                System.out.println( i );
            }
        }
    }

public static String reverseCharacters(String sentence) {
    String [] arrayWords = sentence.split(" ");
    String [] reversedWords = new String[arrayWords.length];
    for(int i = 0; i < arrayWords.length; i++) {
        reversedWords[i] = "";
        for(int j = arrayWords[i].length() - 1; j >= 0; j--)
        {
            reversedWords[i] += arrayWords[i].substring( j, j + 1);
        }
    }
    String newString = String.join (" ", reversedWords);
    return newString;
}

    public static Node balancedTree(ArrayList<Integer> inputList) {
        return helper(inputList, 0, inputList.size() - 1);
    }

    private static Node helper(ArrayList<Integer> inputList, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = low + (high - low) / 2;
//        System.out.println(mid);
        Node head = new Node(inputList.get(mid));
//        System.out.println(head.val);
        head.left = helper(inputList, low, mid - 1);
        head.right = helper(inputList, mid + 1, high);
        return head;

    }
}