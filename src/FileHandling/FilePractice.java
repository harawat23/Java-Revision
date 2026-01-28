package FileHandling;

import java.io.File;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {
        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("New File Created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            File f=new File("C:\\Users\\harawat\\IdeaProjects\\JavaPractice");
            for (var i: f.list()){
                System.out.println(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
