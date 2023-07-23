//Author : Faris Izzatur Rahman
//Informatic Dept. Syiah Kuala University
 
import java.io.*;
 
public class jumlahKata {
 
    public static void main(String[] args) throws IOException {
        File f1 = new File("Documents/readme.txt");
        String[] word = null;
        int wc = 0;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String kata;
        while ((kata = br.readLine()) != null) {
            word = kata.split(" ");
            wc += word.length;
        }
        br.close();
        System.out.print("Banyaknya kata adalah : " + wc);
    }
}