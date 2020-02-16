/**
 * Copyright
 * @author 349604207@gapps.yrdsb.ca

                                                               ,----,
              ,----..                                        ,/   .`|
,-.----.     /   /   \      ,---,.     ,---,.,-.----.      ,`   .'  :
\    /  \   /   .     :   ,'  .'  \  ,'  .' |\    /  \   ;    ;     /
;   :    \ .   /   ;.  \,---.' .' |,---.'   |;   :    \.'___,/    ,'
|   | .\ :.   ;   /  ` ;|   |  |: ||   |   .'|   | .\ :|    :     |
.   : |: |;   |  ; \ ; |:   :  :  /:   :  |-,.   : |: |;    |.';  ;
|   |  \ :|   :  | ; | ':   |    ; :   |  ;/||   |  \ :`----'  |  |
|   : .  /.   |  ' ' ' :|   :     \|   :   .'|   : .  /    '   :  ;
;   | |  \'   ;  \; /  ||   |   . ||   |  |-,;   | |  \    |   |  '
|   | ;\  \\   \  ',  / '   :  '; |'   :  ;/||   | ;\  \   '   :  |
:   ' | \.' ;   :    /  |   |  | ; |   |    \:   ' | \.'   ;   |.'
:   : :-'    \   \ .'   |   :   /  |   :   .':   : :-'     '---'
|   |.'       `---`     |   | ,'   |   | ,'  |   |.'
`---'                   `----'     `----'    `---'
*/


import java.lang.Math;
import java.util.ArrayList;

public class NumbersApplication{

    public static void main(String[] args)
    {
        //List to store all the prime numbers from 1 to 1 million
        ArrayList<Integer> millionPrimes = new ArrayList<>();
        millionPrimes.add(2);
        //Count will be used to calculate how many prime numbers there is
        int count = 0;
        //start the timer to count in ms
        final long startTime = System.currentTimeMillis();
        //Get all prime numbers
        for(int i = 2; i < 1000000; i++)
        {
           boolean isPrime = primeNums(i, millionPrimes);
           if(isPrime)
           {
               millionPrimes.add(i);
               count+=1;
           }
        }
        //Check all pair of primes and enter that to a list of ints
        ArrayList<Integer> pairOfPrime = pairPrimes(millionPrimes);
        //Check for all perfect nums between 1 and 10000
        ArrayList<Integer> perfectNumbers = perfectNums(10000);
        final long endTime = System.currentTimeMillis();
        //print out all prime pairs
        //create numPairs to count pairs
        int numPair = 0;
        for(int i = 0; i < pairOfPrime.size(); i+=2)
        {
           numPair++;
           System.out.printf("Pair %d is %d and %d%n", numPair, pairOfPrime.get(i), pairOfPrime.get(i+1));
        }
        //print all perfect nums
        for(int i = 0; i < perfectNumbers.size();i++)
        {
           System.out.printf("%d is a perfect number%n", perfectNumbers.get(i));
        }
        //print cube digits up to 10000(dosent work past 500
        for(int i = 1; i < 10000; i++){
            boolean isCube = cubeDigit(i);
            if(isCube)
                System.out.printf("The cube of all the digits in %d is itself%n" , i);
        }
        // print all nums that are abundant or deficent between 1-10000
        for(int i = 1; i<=140; i++){
            int x = abundantOrDeficient(i);
            if(x == 1)
                System.out.printf("[+]%d is abundant%n", i);
            else if(x == -1)
                System.out.printf("[-]%d is deficent%n", i);
        }
        System.out.printf("There are %d prime numbers in 1 MILLION%n", count);
        System.out.println("Total execution time: " + (endTime - startTime));
    }

    public static boolean cubeDigit(int x)
    {
        int tmp = x;
        int total = 0;
        while(tmp > 0)
        {
            int digit = tmp % 10;
            total += Math.pow(digit, 3);
            tmp = (int)Math.floor(tmp/10);
        }
        if(total == x)
            return true;
        else
            return false;
    }

    public static int abundantOrDeficient(int x)
    {
       int total = 0;
       for(int y = 1; y<=(int)Math.ceil(x/2); y++)
       {
          if(x%y == 0)
          {
              total += y;
          }
       }
       if(total > x)
       {
           return 1;
       }else if(total < x)
       {
           return -1;
       }else
       {
           return 0;
       }
    }

    public static ArrayList<Integer> perfectNums(int x)
    {
        ArrayList<Integer> perfectNums = new ArrayList<>();
        for(int i = 1; i < x+1; i++)
        {
           int total = 0;
           for(int y = 1; y<=(int)Math.ceil(i/2); y++)
           {
              if(i%y == 0)
              {
                  total += y;
              }
           }
           if(total == i)
           {
               perfectNums.add(i);
           }
        }
        return perfectNums;
    }
    public static ArrayList<Integer> pairPrimes(ArrayList<Integer> primes)
    {
        ArrayList<Integer> pairOfPrimes = new ArrayList<>();
        for(int i = 0; i < primes.size(); i++)
        {
            for(int x = i+1; x < primes.size(); x++)
            {
                if((primes.get(i)*2+1) == primes.get(x))
                {
                    //not the most elegant
                    pairOfPrimes.add(primes.get(i));
                    pairOfPrimes.add(primes.get(x));
                }else if(primes.get(i)*2 +1 < primes.get(x))
                {
                    break;
                }

            }
        }
        return pairOfPrimes;
    }
    public static boolean primeNums(int x, ArrayList<Integer> primes)
    {
        int s = (int)Math.sqrt(x);
        for(int j =0;primes.get(j) <= s; j++)
        {
            if(x%primes.get(j) ==0)
            {
                return false;
            }
        }
        return true;
    }
}
