import java.util.Scanner;

public class programBilangan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i;

        System.out.println("Masukkan tiga buah bilangan!");
        System.out.print("Masukkan bilangan pertama:");
        a = input.nextInt();
        System.out.print("Masukkan bilangan kedua:");
        b = input.nextInt();
        System.out.print("Masukkan bilangan ketiga:");
        c = input.nextInt();

        d = a + b + c;
        e = (a + b + c)/3;
        f = a * b * c;

        if(a > b && a > c){
            g = a;
        }
        else if(b > a && b > c){
            g = b;
        }
        else{
            g = c;
        }

        if(a < b && a < c){
            h = a;
        }
        else if(b < a && b < c){
            h = b;
        }
        else{
            h = c;
        }

        System.out.println("Hasil Penjumlahan = " + d);
        System.out.println("Average = " + e);
        System.out.println("Hasil Perkalian = " + f);
        System.out.println("Bilangan Terbesar = " + g);
        System.out.println("Bilangan Terkecil = " + h);
    }
}