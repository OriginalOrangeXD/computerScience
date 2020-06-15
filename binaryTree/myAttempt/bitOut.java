// Thank you nayuki for saving my sanity
import java.io.OutputStream;
import java.io.IOException;
import java.util.Objects;

public final class bitOut implements AutoCloseable
{
    private OutputStream output;
    private int currentByte;
    private int numFilledBits;
    public bitOut(OutputStream out)
    {
        output = Objects.requireNonNull(out);
        currentByte = 0;
        numFilledBits = 0;
    }
    public void write(int b) throws IOException
    {
        if(b!=0 && b!=1)
        {
            throw new IllegalArgumentException("Must be 1 or 0");
        }
        currentByte = (currentByte << 1) | b;
        numFilledBits++;
        if(numFilledBits == 8)
        {
            output.write(currentByte);
            currentByte = 0;
            numFilledBits = 0;
        }
    }
    public void write(char a) throws IOException
    {
        assert a>=0 &&a < 256;
        for(int i= 0; i<8; i++)
        {
            boolean bit = ((a>>>(8-i-1)) & 1) ==1;
            if(bit)
            {
                write(1);
            }else
            {
                write(0);
            }
        }
    }
    public void close() throws IOException
    {
        while(numFilledBits != 0)
        {
            write(0);
        }
        output.close();
    }
}


