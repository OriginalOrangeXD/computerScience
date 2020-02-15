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
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int count = 0;
        final long startTime = System.currentTimeMillis();
        //Get all prime numbers
        for(int i = 2; i < 10000000; i++)
        {
           boolean isPrime = primeNums(i, primes);
           if(isPrime)
           {
               primes.add(i);
               count+=1;
           }
        }
        final long endTime = System.currentTimeMillis();
        System.out.println(count);
        System.out.println("Total execution time: " + (endTime - startTime));
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
