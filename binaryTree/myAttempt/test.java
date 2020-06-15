import java.io.OutputStream;
import java.io.InputStream;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class test {
    public static void main(String[] args)
    {
        try{
            File path = new File("a1.bin");
            OutputStream out = new FileOutputStream(path);
            out.write(1);
            out.write(0);
            out.write(1);
            out.write(1);
            out.write('h');

            out.write('e');
            out.write('l');
            out.write('l');
            out.write('o');
            out.close();
            InputStream in = new FileInputStream(path);
            System.out.println(in.read()+"");
            System.out.println(in.read()+"");
            System.out.println(in.read()+"");
            System.out.println(in.read()+"");
            System.out.println((char)in.read()+"");
            System.out.println((char)in.read()+"");
            System.out.println((char)in.read()+"");
            System.out.println((char)in.read()+"");
            System.out.println((char)in.read()+"");
            in.close();
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
