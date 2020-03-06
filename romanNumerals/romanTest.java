public class romanTest
{
    public static void main(String[] args)
    {
        Roman r = new Roman(12);
        Roman r2 = new Roman(26);
        r.add(r2);
        System.out.println(r.toRoman());
    }
}
