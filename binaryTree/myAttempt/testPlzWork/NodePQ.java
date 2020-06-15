public class NodePQ
{
    private int MAX;
    private Node[] nodes;
    private int elements;
    public NodePQ()
    {
        MAX = 900000;
        nodes = new Node[MAX];
        elements = 0;
    }
    public void add(Node a)
    {
        int i;
        if(elements == 0)
        {
            nodes[0] = a;
            elements++;
            return;
        }
        for(i = (elements-1); i>=0; i--)
        {
            if(a.freq >nodes[i].freq)
            {
                nodes[i+1] = nodes[i];
            }else
            {
                break;
            }
        }

        nodes[i] = a;
        elements++;
    }
}
