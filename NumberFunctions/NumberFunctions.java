public class NumberFunctions
{
    public static int min(int a, int b)
    {
        if (a > b) return b;
        return a;
    }
    public static float min(float a, float b)
    {
        if (a > b) return b;
        return a;
    }
    public static double min(double a, double b)
    {
        if (a > b) return b;
        return a;
    }
    public static int min(int[] arrayOfInts)
    {
        int worstScore = Integer.MAX_VALUE;
        for(int i = 0; i < arrayOfInts.length; i++)
        {
            if(arrayOfInts[i] < worstScore)
            {
                worstScore = arrayOfInts[i];
            }
        }
        return worstScore;
    }
    public static int max(int a, int b)
    {
        if (a < b) return b;
        return a;
    }
    public static float max(float a, float b)
    {
        if (a < b) return b;
        return a;
    }
    public static double max (double a, double b)
    {
        if (a < b) return b;
        return a;
    }
    public static int max(int[] arrayOfInts)
    {
        int bestScore = Integer.MIN_VALUE;
        for(int i = 0; i < arrayOfInts.length; i++)
        {
            if(arrayOfInts[i] > bestScore)
            {
                bestScore = arrayOfInts[i];
            }
        }
        return bestScore;
    }
    public static void main(String[] args)
    {
            int[] numArry = new int[] {6, 100, 8, 9, 98};
            System.out.printf("The max between 5 and 10 is %d%n", max(5, 10));
            System.out.printf("The max between 5.89 and 6.25 is %f%n", max(5.89, 6.25));
            System.out.printf("The max between 6, 100, 8, 9, and 98 is %d%n", max(numArry));
            System.out.printf("The min between 5 and 10 is %d%n", min(5, 10));
            System.out.printf("The min between 5.89 and 6.25 is %f%n", min(5.89, 6.25));
            System.out.printf("The min between 6, 100, 8, 9, and 98 is %d%n", min(numArry));

    }
}


