import java.util.*;
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


        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int  value = entry.getValue();

            System.out.println ("Key: " + key + " Value: " + value);
        }
    }

    public static void main(String[] args) {
        // extremely manual method of creating a tree
        String s  = "HELLO MY NAME IS ROBERT";

        makeTree(s);
        // Does the following work?
//        System.out.println("C with leftmost of root: " +
  //              isInTree('C',r.leftNode.leftNode.leftNode.leftNode.leftNode)); // broken?
    }
}

