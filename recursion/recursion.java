public class recursion
{
    public static long combo;
    public static long factTotal = 1;
    public static long powerTotal;

    /**
     * This power method returns the value of the first input to the power of the second
     * @param base long base input
     * @param exponent long exponent input
     * @return the value of the base to the power of the exponent
     */
    public static long power(long base, long exponent)
    {
        if(exponent == 0) return 1;
        powerTotal += power(base, exponent-1) * base;
        return powerTotal;
    }


    /**
     * This combonations method will find all unique permutations with a set size
     * @param setSize long input of the amount of objects
     * @param permSize long input of the permutation size
     * @return the amount of unique permutations
     */
    public static long combonations(long setSize, long permSize)
    {
        if(setSize == permSize || permSize == 0||permSize > setSize) return 1;
        combo = combonations(setSize-1,permSize) + combonations(setSize-1, permSize-1);
        return combo;
    }

    /**
     * This gcd method will find the greatest common denominator between 2 numbers
     * @param num1 long input that is not zero
     * @param num2 long input that is not zero
     * @return the greatest common denominator
     */
    public static long gcd(long num1, long num2)
    {
        if(num2 == 0) return num1;
        return gcd(num2, num1%num2);

    }

    /**
     * This factorial method will return the factorial
     * @param x long input to find the factorial of the number
     * @return the long of the factorial of the number
     */
    public static long factorial(long x)
    {
        if(x <= 0) return factTotal;
        factTotal*= x;
        return factorial(x-1);
    }


    /**
     * This fibonacci method will find a given position inthe fibonacci sequence
     * @param pos long input to identify the position
     * @return the number in that position of the fibbonacci sequence
     */
    public static long fibonacci(long pos)
    {
        if(pos <=2) return 1;
        return fibonacci(pos-1) + fibonacci(pos-2);
    }

    public static void main(String[] args)
    {
        System.out.println(combonations(5, 2));
        System.out.println(factorial(4));
        System.out.println(power(4, 6));
        System.out.println(gcd(4096,8192));
        System.out.println(fibonacci(13));
    }
}
