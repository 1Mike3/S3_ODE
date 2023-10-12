package E6_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class GetHiddenInformation {
    //Class to get the hidden Information inside a jpeg
    public static void main(String[] args){
        try (FileReader fileReader = new FileReader("pic.jpeg");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            char buffer[] = new char[1000000];
            int bufferInputCounter = 0;

            bufferedReader.read(buffer, 0, 1000000);

            int i = 0;
            System.out.println("LETTERS PRINTED OUT IN BLOCKS: \n");
            for (char c: buffer
                 ) {
                if(c != 0)
                    bufferInputCounter++;

                if(Character.isLetter(c)){
                    i++;
                    System.out.print(c);
                    if(i%10 == 0)
                        System.out.print(" ");

                    if(i%50 == 0)
                        System.out.println("\n");

                }

            }


System.out.println("\n\nWHOLE FILE PRINTED OUT:\n");

            System.out.println("Counted Buffer Length: " + bufferInputCounter);
            File f = new File("pic.jpeg");
            long filesize = f.getTotalSpace();
            System.out.println("Counted Filesize: " + filesize);
         System.out.println(buffer);



        }catch (Exception e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
