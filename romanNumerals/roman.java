import java.util.Scanner;
public class roman
{
    public static boolean isValid(int a)
    {
        if(a<5000) return true;
        return false;
    }
    public static boolean isValid(String a)
    {
        //Special case-- I[XV] || V?{0-3}
    }
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
        int[] intValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romanString = "";
        String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i = 0; i < romanValues.length; i++)
        {
            while(a >= intValues[i])
            {
                a -= intValues[i];
                romanString = romanString + romanValues[i];
            }
        }
        return romanString;
    }
    public static void main(String[] args)
    {
        String inputRoman;
        int inputInt;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roman number");
        inputRoman = input.nextLine();
        System.out.println("Enter you int");
        inputInt = input.nextInt();
        System.out.printf("The int of the roman numberal of %s is %d%n",inputRoman, convertToInt(inputRoman));
        System.out.printf("The string of the int of %d is %s%n",inputInt, convertToString(inputInt));
    }
}

