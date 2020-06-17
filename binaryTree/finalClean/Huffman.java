import java.util.*;
import java.io.FileWriter;
import java.util.Map.*;
import java.io.*;
import java.nio.file.*;

/**
  * Copyright
  *  * @author 349604207@gapps.yrdsb.ca
  *
  *                                                                                ,----,
  *                               ,----..                                        ,/   .`|
  *                 ,-.----.     /   /   \      ,---,.     ,---,.,-.----.      ,`   .'  :
  *                 \    /  \   /   .     :   ,'  .'  \  ,'  .' |\    /  \   ;    ;     /
  *                 ;   :    \ .   /   ;.  \,---.' .' |,---.'   |;   :    \.'___,/    ,'
  *                 |   | .\ :.   ;   /  ` ;|   |  |: ||   |   .'|   | .\ :|    :     |
  *                 .   : |: |;   |  ; \ ; |:   :  :  /:   :  |-,.   : |: |;    |.';  ;
  *                 |   |  \ :|   :  | ; | ':   |    ; :   |  ;/||   |  \ :`----'  |  |
  *                 |   : .  /.   |  ' ' ' :|   :     \|   :   .'|   : .  /    '   :  ;
  *                 ;   | |  \'   ;  \; /  ||   |   . ||   |  |-,;   | |  \    |   |  '
  *                 |   | ;\  \\   \  ',  / '   :  '; |'   :  ;/||   | ;\  \   '   :  |
  *                 :   ' | \.' ;   :    /  |   |  | ; |   |    \:   ' | \.'   ;   |.'
  *                 :   : :-'    \   \ .'   |   :   /  |   :   .':   : :-'     '---'
  *                 |   |.'       `---`     |   | ,'   |   | ,'  |   |.'
  *                 `---'                   `----'     `----'    `---'
  *                                                                               */

public class Huffman{
    //create a public BinaryStdIn variable called in file
    //this is done so in my readTrie function the recursion works properly
    public static BinaryStdIn inFile;
    /**
     * Parse through the tree given at Node n to see if the character c is
     * within it
     * @param c character to look for in the tree
     * @param n a node within the tree
     * @return boolean on whether or not the character exists in the tree
     */
    public static boolean isInTree (char c, Node n) {
        if (n == null) return false;
        else if (n.getValue() == c) return true;
        return isInTree (c, n.leftNode) || isInTree(c, n.rightNode);
    }
    /** Builds the huffman trie based on maped frequecies maped to characters
     * @param freq a Map<Character, Integer> that should be > 1 in size
     * @return Node, returns the huffman trie in the form of a node*/
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
    /** Maps the frequecy of each character to its corresponding character(Character must be ASCII)
     * @param s String that you would like to count freq of character
     * @return Map<Character, Integer> returns all characters maped to the frequecies*/
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
    /** Takes in a file name and reads all ASCII characters saving them in memory as a string
     * @param fileName file you would like to read
     * @return returns a string value of the file*/
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    //algs4
    /** Creates a lookUp table for each charater
     * @param lookUp empty String[] dictonary that has a size of 256(ASCII)
     * @param n Node value that has the huffman trie
     * @param s String value that must be empty ex. ""*/
    public static String[] lookUpTree(String[] lookUp, Node n, String s)
    {
        if(!n.isLeaf())
        {
            lookUpTree(lookUp, n.rightNode, s+'1');
            lookUpTree(lookUp, n.leftNode, s+'0');
        }
        else
        {
            //System.out.println(n.getValue()+ " code " + s);
            lookUp[n.getValue()] = s;
        }
        return lookUp;

    }


    /** writes trie to file from left node to right node
     * @param n Node value that holds the trie
     * @param file file you would like to output the binary trie to*/
    public static void writeTrie(Node n, BinaryStdOut file) throws IOException
    {
        if(n.isLeaf())
        {
            //System.out.println(1+""+n.getValue()+"");
            file.write(true);
            file.write(n.getValue(), 8);
            return;
        }
        file.write(false);

        writeTrie(n.leftNode, file);

        writeTrie(n.rightNode, file);
    }
    /** reads trie from file and returns trie node
     * @return returns Node value of the huffman trie*/
    public static Node readTrie() {
        boolean isLeaf = BinaryStdIn.readBoolean();
        if (isLeaf) {
            return new Node(BinaryStdIn.readChar(), -1, null, null);
        }
        else {
            return new Node('\0', -1, readTrie(), readTrie());
        }
    }
    /** Expands huffman compressed file to given file name
     * @param trie Node value huffman trie
     * @param compress BinaryStdIn object; file you would like to expand
     * @param outFile BinaryStdOut object; file to output decompressed version of file*/
    public static void expand(Node trie, BinaryStdIn compress, BinaryStdOut outFile)
    {
        int length = compress.readInt();
        //System.out.println(length);
        for(int i = 0; i<length; i++)
        {
            Node x = trie;
            while (!x.isLeaf()) {

                boolean bit = compress.readBoolean();
                if (bit)
                {
                    x = x.rightNode;
                }
                else
                {x = x.leftNode;

                }
            }
            outFile.write(x.getValue(), 8);
        }
        compress.close();
        outFile.close();
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
    /** Compresses given file with lookUp table
     * @param lookUps String[] value that holds the binary encoding of each character
     * @param s String you would like to compress
     * @param outFile file you would like to output the compression*/
    public static void manualCompress(String[] lookUps, String s, String outFile) throws Exception
    {
        try{
            BinaryStdOut comp = new BinaryStdOut(outFile);
         //   System.out.println(s.length());
            comp.write(s.length());
            for (int i = 0; i < s.length(); i++) {
                String code = lookUps[s.charAt(i)];
                for (int x = 0; x < code.length(); x++)
                {
                    if(code.charAt(x) == '1')
                    {
                        comp.write(true);
                    }
                    else if(code.charAt(x) == '0')
                    {
                        comp.write(false);
                    }
                }
            }
            comp.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }


    }

    /** Executes all steps to compress file. The easy way to compress a file
     * Names main file fileOut+".bin" and names trie fileOut+"Trie.bin"
     * @param fileIn String value of txt file you would like to compress with out extension
     * @param fileOut Sting value of the name you want the compressed file and trie to be*/
    public static void fullCompress(String fileIn, String fileOut) throws Exception
    {
        String s = readFileAsString(fileIn+".txt");
        Map<Character, Integer> map = makeTree(s);
        Node trie = trieBuilder(map);
        String[] lookUp = new String[256];
        lookUp = lookUpTree(lookUp, trie, "");
        manualCompress(lookUp, s,fileOut+".bin");
        BinaryStdOut comp = new BinaryStdOut(fileOut+"Trie.bin");
        writeTrie(trie, comp);
        comp.close();
    }
    /** Decompress file based on fileIn and outputs ascii to fileOut
     * Assumes fileIn+".bin" is the file name and fileIn+"Trie.bin" is the trie name
     * @param fileIn String value that hold the name of the file to decompress without the file extension
     * @param fileOut String value where the decompressed ascii will go as a .txt*/
    public static void deCompress(String fileIn, String fileOut) throws Exception
    {
        BinaryStdIn inFile = new BinaryStdIn(fileIn+"Trie.bin");
        Node inTrie = readTrie();
        inFile.close();
        BinaryStdIn inc = new BinaryStdIn(fileIn+".bin");
        BinaryStdOut abs = new BinaryStdOut(fileOut+".txt");
        expand(inTrie, inc, abs);
    }
}

