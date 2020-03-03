public class roman
{
    public static int values(char romanNumeral)
    {
       if(romanNumeral == 'I') return 1;
       if(romanNumeral == 'V') return 5;
       if(romanNumeral == 'X') return 10;
       if(romanNumeral == 'L') return 50;
       if(romanNumeral == 'C') return 100;
       if(romanNumeral == 'D') return 500;
       if(romanNumeral == 'M') return 1000;
       else return 0;
    }
    public static int convertToInt(String romanNumeral)
    {
       int total = 0;
       for(int i = 0; i < romanNumeral.length(); i++)
       {
           int value1 = values(romanNumeral.charAt(i));
           if(i+1 < romanNumeral.length())
           {
              int value2 = values(romanNumeral.charAt(i+1));
              if(value1 >= value2) total += value1;
              else if(value1 < value2)
              {
                  total+=value2-value1;
                  i++;
              }
           }else total += value1;
       }
       return total;
    }
    public static String convertToString(int a)
    {
        return "Hello";
    }
    public static void main(String[] args)
    {
        System.out.printf("The int of the roman numberal of X is %d%n", convertToInt("IVCMXCIX"));
    }
}

