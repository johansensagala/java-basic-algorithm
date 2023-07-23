import java.util.ArrayList;
import java.util.Scanner;

class programPencarianElemenArrayList {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<String> merk = new ArrayList<String>();
        merk.add("ASUS");
        merk.add("Lenovo");
        merk.add("HP");
        merk.add("Aspire"); 

        System.out.println(merk);
        
        String laptop;
        System.out.println("Masukkan merk laptop yang ingin anda cari! ");
        laptop = s.nextLine();

        if(merk.contains(laptop)){
            System.out.println("Merk tersedia");
        }
        else{
            System.out.println("Maaf, tidak tersedia");
        }
    }
}
