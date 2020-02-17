public class ConsecutiveSeries
{
    public static void main(String[] args)
    {
        for(int i = 1; i <=10000; i++)
        {
            for(int x = 1; x <=300; x++)
            {
                if(x*i+x/2*(x+1) == 10000)
                System.out.printf("%d through %d%n", i, i+x);
            }
        }
    }
}
