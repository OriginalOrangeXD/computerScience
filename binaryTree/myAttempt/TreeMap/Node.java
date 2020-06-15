
public class Node{
    public int freq;
    public char value;
    public Node leftNode;
    public Node rightNode;

    public Node (int n) {
        this.freq = n;
    }

   public boolean isLeaf()
   {
      if(this.leftNode == null && this.rightNode == null)
      {
          return true;
      }
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
}

