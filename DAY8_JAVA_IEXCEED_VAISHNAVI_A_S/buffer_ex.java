import java.io.*;
import java.util.Scanner;
public class buffer_ex{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("file name:");
        String filename=sc.nextLine();
        System.out.println("file content:");
        String content=sc.nextLine();
        sc.close();
        FileOutputStream f1=new FileOutputStream(filename);
        byte[]data=content.getBytes();
        f1.write(data);
        f1.close();
        BufferedInputStream bf=new BufferedInputStream( new FileInputStream(filename));
        int i=0;
        while((i=bf.read())!=-1){
            System.out.println((char)i);
        }
        bf.close();
    }
}