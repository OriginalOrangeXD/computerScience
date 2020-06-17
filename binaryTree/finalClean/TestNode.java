public class TestNode
{
    public static void main(String[] args)
    {
        try{
        Huffman huf = new Huffman();
        huf.fullCompress("testfile", "Compress");
        huf.deCompress("Compress", "outfile");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
