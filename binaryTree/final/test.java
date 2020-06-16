import java.io.*;
public class test
{
    public static BinaryStdIn inFile;
    public static void main(String[] args) throws Exception
    {
        BinaryStdOut out = new BinaryStdOut("CT.bin");
        out.write(true);
        out.write(false);
        out.write(true);
        out.write(true);
        out.write('x');
        out.close();
        inFile = new BinaryStdIn("CompressTrie.bin");
        Node n = readTrie();
        System.out.println(n.leftNode.leftNode.getValue());

        System.out.println(n.leftNode.rightNode.leftNode.getValue());
        System.out.println(n.rightNode.rightNode.leftNode.rightNode.rightNode.getValue());
    }
    private static Node readTrie() {
        boolean isLeaf = BinaryStdIn.readBoolean();
        if (isLeaf) {
            return new Node(BinaryStdIn.readChar(), -1, null, null);
        }
        else {
            return new Node('\0', -1, readTrie(), readTrie());
        }
    }

/*    public static Node readTrie() throws IOException {
        iystem.out.println(isLeaf);
        boolean isLeaf = inFile.readBoolean();
        System.out.println(isLeaf);
        if(isLeaf)
        {
            System.out.println("IN LEAF");
            System.out.println(inFile.readChar());
            return new Node(inFile.readChar(),-1,null,null);
        }
        else
        {
            System.out.println("NOT LEAF");
            return new Node('\0', -1, readTrie(), readTrie());
        }
}*/
}
