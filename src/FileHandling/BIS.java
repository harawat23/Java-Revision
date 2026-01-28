package FileHandling;

import java.io.*;

public class BIS {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("output.txt");
        BufferedOutputStream bs=new BufferedOutputStream(fo); //fast writter

        File f=new File("output.txt");
        f.createNewFile();

//        FileInputStream fs=new FileInputStream("input.txt");
        String s="Hello masncasncnsa";
        bs.write(s.getBytes());
        bs.flush();
    }
}
