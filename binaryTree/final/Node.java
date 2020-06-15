

public class Node implements Comparable<Node>{
    private int freq;
    private char value;
    public Node leftNode;
    public Node rightNode;


    public int getFreq(){return this.freq;}
    public char getValue(){return this.value;}

    public boolean isLeaf()
    {
        if(this.leftNode == null && this.rightNode == null)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public Node (int n) {
        this.freq = n;
    }

    public Node (char a, int n) {
        this.value = a;
        this.freq = n;
    }

    public Node (char a, int n, Node left, Node right) {
        this.value = a;
        this.freq = n;
        this.leftNode = left;
        this.rightNode = right;
    }

    public void setFreq (int n) {
        this.freq = n;
    }

    public void setValue (char a) {
        this.value = a;
    }

//Some great stuff that makes


    public boolean equals(Node other)
    {
        return this.getFreq() == other.getFreq();
    }

    public int compareTo(Node other)
    {
        if(this.equals(other))
            return 0;
        else if(getFreq() >other.getFreq())
            return 1;
        else
            return -1;
    }
}

