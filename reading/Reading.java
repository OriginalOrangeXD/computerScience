import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Reading
{
    public static void main (String args[]){
        BufferedReader in;
        try{
            String s = " ";
            in = new BufferedReader(new FileReader("data.txt"));
            String firstName, lastName, email, phoneNumber, address, city, province, postalCode;
            System.out.println("START OF FILE");
            while(s!= null){
                try{
                    s = in.readLine();
                    ArrayList<String> data = new ArrayList<>(Arrays.asList(s.split(",")));
                    firstName = data.get(0);
                    lastName = data.get(1);
                    email = data.get(2);
                    phoneNumber = data.get(3);
                    address = data.get(4);
                    city = data.get(5);
                    province = data.get(6);
                    postalCode = data.get(7);
                    System.out.println ("first name = " + firstName);
                    System.out.println ("last name = " + lastName);
                    System.out.println ("email = " + email);
                    System.out.println ("phone number = " + phoneNumber);
                    System.out.println ("address = " + address);
                    System.out.println ("city = " + city);
                    System.out.println ("province = " + province);
                    System.out.println ("postal code = " + postalCode);
                } catch (IOException e) {
                    System.out.println("I/O ERROR");
                } catch (NullPointerException e){
                    System.out.println("END OF FILE");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("No file found");
        }
    }
}

