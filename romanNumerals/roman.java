import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class roman
{
    /**isValid will take in a int and ensure it can be made into a roman numeral
     * @param a int - the int you would like to check
     * @return boolean - true if the num is less than 5000
    **/
    public static boolean isValid(int a)
    {
        //check if number is less than 5000 if so  return true
        if(a<5000) return true;
        //if not then return false
        return false;
    }
    /**isValid will take in a string and check if the string is valid
     * @param a string - roman numeral you would like to check
     * @return boolean - true if the roman numeral is valid
    **/
    public static boolean isValid(String a)
    {
        //Set pattern that will match all roman numbers
        //M{0,4} will allow 0-4 M's
        //C[MD]|D?C{0,3} will check for to see if C is with M or D but not both, Xor check if D is present or not present with 0-3'Cs
        //X[CL]|L?X{0,3} will check for to see if X is with C or L but not both, Xor check if L is present or not present with 0-3'Xs
        //I[XV]|V?I{0,3} will check for to see if I is with X or V but not both, Xor check if V is present or not present with 0-3'Is
        Pattern regex = Pattern.compile("^M{0,4}(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
        Matcher isMatch =regex.matcher(a);
        //check if the pattern of regex finds a match if so return true
        if(isMatch.find()) return true;
        //if not return false
        return false;
    }
    /**values will take in a roman letter and return the value of it
     * @param romanNumeral char - the letter you want to find the value of
     * @return int value of the letter
    **/
    public static int values(char romanNumeral)
    {
       //check each letter and match it with a value
       if(romanNumeral == 'I') return 1;
       if(romanNumeral == 'V') return 5;
       if(romanNumeral == 'X') return 10;
       if(romanNumeral == 'L') return 50;
       if(romanNumeral == 'C') return 100;
       if(romanNumeral == 'D') return 500;
       if(romanNumeral == 'M') return 1000;
       else return 0;
    }
    /** convertToInt takes in a roman numeral and returns the int value
     * @param romanNumeral string
     * @return int- value of roman numeral
    **/
    public static int convertToInt(String romanNumeral)
    {
       //total var will hold the int of the roman numeral
       int total = 0;
       if(isValid(romanNumeral))
       {
           //itterate through each letter in the roman numeral
           for(int i = 0; i < romanNumeral.length(); i++)
           {
               int value1 = values(romanNumeral.charAt(i));
               if(i+1 < romanNumeral.length())
               {
                  int value2 = values(romanNumeral.charAt(i+1));
                  //if the letter has a greater value than the second
                  if(value1 >= value2) total += value1;
                  else if(value1 < value2)
                  {
                      total+=value2-value1;
                      i++;
                  }
               }else total += value1;
           }
       }
       return total;
    }
    /**convertToString will take in an int and return the roman number
     * @param a int - the number you would like to find the roman numeral of
     * @return String - roman numeral of the int
    **/
    public static String convertToString(int a)
    {
        String romanString = "";
        if(isValid(a))
        {
            int[] intValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
            for(int i = 0; i < romanValues.length; i++)
            {
                while(a >= intValues[i])
                {
                    a -= intValues[i];
                    romanString = romanString + romanValues[i];
                }
            }
        }
        return romanString;
    }
    public static void main(String[] args)
    {
        int inputInt;
        String inputRoman;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roman number");
        inputRoman = input.nextLine();
        System.out.println("Enter your int");
        inputInt = input.nextInt();
        input.close();
        if(convertToInt(inputRoman) != 0) System.out.printf("The int of the roman numberal of %s is %d%n",inputRoman, convertToInt(inputRoman));
        else System.out.printf("The string %s is not a valid roman numeral%n", inputRoman);
        if(convertToString(inputInt) != "") System.out.printf("The string of the int of %d is %s%n",inputInt, convertToString(inputInt));
        else System.out.printf("The int %d can not be properly converted to a roman numeral%n",inputInt);
    }
}

