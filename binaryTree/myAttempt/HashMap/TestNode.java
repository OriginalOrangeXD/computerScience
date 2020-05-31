import java.util.*;
import java.io.*;
import java.nio.file.*;
public class TestNode {
    /**
     *   * Parse through the tree given at Node n to see if the character c is
     *          * within it
     *               * @param c character to look for in the tree
     *                   * @param n a node within the tree
     *                       * @return boolean on whether or not the character exists in the tree
     *                           */
    public static boolean isInTree (char c, Node n) {
        if (n == null) return false;
        else if (n.value == c) return true;
        return isInTree (c, n.leftNode) || isInTree(c, n.rightNode);
    }
    public static Node trieBuilder(Map<Character, Integer> freq)
    {
        Node r = new Node(0)
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();

    public static void makeTree(String s)
    {
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != null){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        }

    }
    // Thanks Geeks for Geeks
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main(String[] args)throws Exception {
        // extremely manual method of creating a tree
        String s = readFileAsString("war-and-peace.txt");
        makeTree(s);
        // Does the following work?
//        System.out.println("C with leftmost of root: " +
  //              isInTree('C',r.leftNode.leftNode.leftNode.leftNode.leftNode)); // broken?
    }
}

