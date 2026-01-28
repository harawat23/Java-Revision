package FileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws IOException {
//        FileInputStream read=new FileInputStream("input.txt");
//
//        int data=read.read();
//        while(data!=-1){
//            System.out.print((char)data);
//            data=read.read();
//        }
//
//        //Use Buffered input stream for this
//        read.close();
//
//        BufferedInputStream bi=new BufferedInputStream(new FileInputStream("input.txt"));
//        System.out.println(bi.read());
//        bi.close();

        // it is better to read most of the data in bulk , use scanner to make parsing easier

//        BufferedInputStream bi_1=new BufferedInputStream(new FileInputStream("input.txt"));
//
//        Scanner sc=new Scanner(bi);
//
//        while(sc.hasNextLine()){
//            System.out.print(sc.nextLine());
//        }

        // use inputstream for converting byte to characters

        InputStream is=new FileInputStream("input.txt");

        InputStreamReader r=new InputStreamReader(is, StandardCharsets.UTF_8);

        Scanner sc1=new Scanner(r);

        while(sc1.hasNext()){
            System.out.println(sc1.nextLine());
        }
    }
}
