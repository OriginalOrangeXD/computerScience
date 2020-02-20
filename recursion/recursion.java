public class recursion
{
    public static long combo;
    public static long factTotal = 1;
    public static long powerTotal;

    public static long power(long x, long n)
    {
        if(n == 0) return 1;
        powerTotal += power(x, n-1) * x;
        return powerTotal;
    }


    public static long combonations(long n, long r)
    {
        if(n == r || r == 0||r > n) return 1;
        combo = combonations(n-1,r) + combonations(n-1, r-1);
        return combo;
    }

    public static long gcd(long m, long n)
    {
        if(n == 0) return m;
        return gcd(n, m%n);

    }

    public static long factorial(long x)
    {
        if(x <= 0) return factTotal;
        factTotal*= x;
        return factorial(x-1);
    }

    public static long fibonacci(long x)
    {
        if(x <=2) return 1;
        return fibonacci(x-1) + fibonacci(x-2);
    }

    public static void main(String[] args)
    {
        System.out.println(combonations(4, 2));
        System.out.println(factorial(4));
        System.out.println(power(4, 6));
        System.out.println(gcd(7,6));
        System.out.println(fibonacci(13));
    }
}
