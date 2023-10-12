package L6_Streams;

import java.io.*;

public class StreamExample {
    public static void main(String[] args){
        InputStream is = System.in;
        //is.read() ... byte buffer
        Reader read = new InputStreamReader(is);
        //reader.read() character Buffer
        BufferedReader bufferedReader = new BufferedReader(read);
     //   bufferedReader.readLine();

        // BYTE outputstream to Character/String Wirter
       // OutputStream fos =

        //Stopped halfway through the excercise


    }
}
