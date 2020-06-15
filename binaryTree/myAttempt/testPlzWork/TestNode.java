import java.util.*;
import java.io.FileWriter;
import java.util.Map.*;
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
        else if (n.getValue() == c) return true;
        return isInTree (c, n.leftNode) || isInTree(c, n.rightNode);
    }
    public static Node trieBuilder(Map<Character, Integer> freq)
    {
        int x = 1;
        PriorityQueue<Node> nodes = new PriorityQueue<Node>();
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            nodes.add(new Node(entry.getKey(), entry.getValue()));
            //System.out.println(entry.getKey() +" Value "+ entry.getValue());
        }

        while(nodes.size() > 1)
        {
            Node left = nodes.poll();
            Node right = nodes.poll();
            Node parent = new Node('\0', left.getFreq()+right.getFreq(),left,right);
            nodes.add(parent);
        }

        return nodes.poll();
    }

    public static Map<Character, Integer> makeTree(String s)
    {
        Map<Character, Integer> map= new TreeMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != null){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        return map;
    }
    // Thanks Geeks for Geeks
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    //algs4
    public static String[] lookUpTree(String[] lookUp, Node n, String s)
    {
        if(!n.isLeaf())
        {
            lookUpTree(lookUp, n.rightNode, s+'1');
            lookUpTree(lookUp, n.leftNode, s+'0');
        }
        else
        {
            System.out.println(n.getValue()+ " code " + s);
            lookUp[n.getValue()] = s;
        }
        return lookUp;

    }

    public static void writeTrie(Node n, bitOut file) throws IOException
    {
        if(n.isLeaf())
        {
            file.write(1);
           file.writeByte(n.getValue());
            return;
        }
        file.write(0);

        writeTrie(n.leftNode, file);
        writeTrie(n.rightNode, file);
    }
    public static Node readTrie(BinaryStdIn file) throws IOException
    {
        boolean isleaf = file.read();
        if(isleaf)
        {
            return new Node((char)file.readChar(),-1,null,null);
        }
        else
        {
            return new Node('\0', -1, readTrie(file), readTrie(file));
        }
    }
/*
    public static void writeTrie(Node n, FileWriter file) throws IOException
    {
        if(n.isLeaf())
        {
            file.write("1");
            file.write(n.getValue());
            return;
        }
        file.write("0");

        writeTrie(n.leftNode, file);
        writeTrie(n.rightNode, file);
    }

    public static Node readTrie()
    {
        boolean isLeaf =
        */
    public static void compress(String[] lookUps, String s)
    {
        try{
            File path = new File("Compress.bin");
            OutputStream file = new FileOutputStream(path);
            bitOut comp = new bitOut(file);
            for (int i = 0; i < s.length(); i++) {
                String code = lookUps[s.charAt(i)];
                for (int x = 0; x < code.length(); x++)
                {
                    if(code.charAt(x) == '1')
                    {
                        comp.write(1);
                    }
                    else if(code.charAt(x) == '0')
                    {
                        comp.write(0);
                    }
                }
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args)throws Exception {
        // extremely manual method of creating a tree
        String s = readFileAsString("war-and-peace.txt");
        Map<Character, Integer> map = makeTree(s);
        Node trie = trieBuilder(map);
        String[] lookUp = new String[256];
        lookUp = lookUpTree(lookUp, trie, "");
        compress(lookUp, s);
        File path = new File("CompressTrie.bin");
        OutputStream file = new FileOutputStream(path);
        bitOut comp = new bitOut(file);
        writeTrie(trie, comp);
        file.close();

        InputStream file1 = new FileInputStream(path);
        BitStdIn in = new BinaryStdIn(file1);
        readTrie(in);
        in.close();

        // Does the following work?
//        System.out.println("C with leftmost of root: " +
  //              isInTree('C',r.leftNode.leftNode.leftNode.leftNode.leftNode)); // broken?
    }
}

