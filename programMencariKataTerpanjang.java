import java.io.File;
import java.util.Scanner;

public class programMencariKataTerpanjang {
    public static void main(String[] args) {
        try{
            File Program = new File("Documents/readme.txt");
            Scanner input = new Scanner(Program);
            int panjangKata = 0;
            int jumlahHuruf;
            String kataTerpanjang = "null";
            while(input.hasNext()){
                String teks = input.next();
                jumlahHuruf = teks.length();
                if (jumlahHuruf > panjangKata){
                    panjangKata = jumlahHuruf;
                    kataTerpanjang = teks;
                }
            } 
            System.out.println("Kata terpanjang yang terdapat pada teks adalah: " + kataTerpanjang + " dengan jumlah angka sebanyak " + panjangKata);

        input.close();
        } catch (Exception e) {
            System.out.println("File tidak ada");
            e.printStackTrace();
        }
    }
}
