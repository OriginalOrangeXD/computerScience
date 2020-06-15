public class test
{
    public static void test(String[] args)
    {
        BinaryStdOut out = new BinaryStdOut("CT.bin");
        out.write(true);
        out.write(false);
        out.write(true);
        out.write(true);
        out.write('x');
        out.close();
        BinaryStdIn in = new BinaryStdIn("CT.bin");
        System.out.println(in.readBoolean()+"");
        System.out.println(in.readBoolean()+"");
        System.out.println(in.readBoolean()+"");
        System.out.println(in.readBoolean()+"");
        System.out.println(in.readChar()+"");
    }
}
