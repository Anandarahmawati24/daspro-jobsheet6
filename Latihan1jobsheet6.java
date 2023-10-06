import java.util.Scanner;
public class Latihan1jobsheet6{
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int bil1=28, bil2=54, bil3=15 , terbesar;

        if (bil1>= bil2 && bil1>= bil3) {
            terbesar=bil1;
        }else if (bil2 >= bil1 && bil2>= bil3) {
            terbesar=bil2;
        } else {
            terbesar= bil3;
        }
        System.out.println(" Bilangan terbesar adalah " +terbesar );
    } 
}