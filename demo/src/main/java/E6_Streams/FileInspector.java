package E6_Streams;

import java.io.*;

public class FileInspector {

    static File LogFile;
    static BufferedWriter classWriteStream;
    public static void print(String printString) throws IOException {
        System.out.println(printString);
        classWriteStream.append(printString).append("\n");
    }
    public static void main(String[] args) {
        System.Logger logger = System.getLogger("FileInspector");
        //logger.log(System.Logger.Level.INFO, "FileInspector started");

       // LogFile = new File("./demo/src/main/java/E6_Streams/logfile.txt");
try  (
        FileWriter fileWriter = new FileWriter("./demo/src/main/java/E6_Streams/logfile.txt", false);
        BufferedWriter fileBuffOSW = new BufferedWriter(fileWriter))
{


    classWriteStream = fileBuffOSW;

  // classWriteStream.append("Test\n");


    print("file assigned");
    File myfile = new File("./demo/src/main/java/E6_Streams/testfile.txt");

    print("filepath: " + myfile.getAbsolutePath());
    print("file exists: " + myfile.exists());
    print("file is directory: " + myfile.isDirectory());
    print("file is file: " + myfile.isFile());
    print("file is hidden: " + myfile.isHidden());
    print("cannonicalPath?:" + myfile.getCanonicalPath());
    print("file Parrent: " + myfile.getParent());
    print("file length: " + myfile.length());
    print("file can read writ and execute: " + myfile.canRead() + " " + myfile.canWrite() + " " + myfile.canExecute());
    print("file last modified: " + myfile.lastModified());
    print("working Directory at time of Prints: " + System.getProperty("user.dir"));



}catch (FileNotFoundException  e){
    System.out.println("Error: " + e.getMessage());
} catch (IOException ex) {
        throw new RuntimeException(ex);
    } finally {

    System.out.println("FileInspector finished");
}

    }
}
