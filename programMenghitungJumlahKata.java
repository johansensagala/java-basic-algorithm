import java.io.File;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class programMenghitungJumlahKata {
    public static void main(String[] args) {
        try{
            File Program = new File("Documents/readme.txt");
            Scanner input = new Scanner(Program);
            int jumlah = 0;
            while(input.hasNext()){
                String teks = input.next();
                System.out.print(teks + " ");
                ++jumlah;
            }
            System.out.println();
            System.out.println("Jumlah kata yang terdapat pada teks adalah: " + jumlah + " buah");

        input.close();
        } catch (Exception e) {
            System.out.println("File tidak ada");
            e.printStackTrace();
        }
    }
}