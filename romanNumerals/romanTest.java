public class romanTest
{
    public static void main(String[] args)
    {
        Roman r = new Roman(12);
        String rString = r.toRoman();
        Roman r2 = new Roman(26);
        r.add(r2);
        System.out.printf("%s + %s == %s%n",rString, r2.toRoman(),r.toRoman());
        String rSubString = r.toRoman();
        r.sub(r2);
        System.out.printf("%s - %s == %s%n",rSubString, r2.toRoman(),r.toRoman());
    }
}
