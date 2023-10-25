import java.util.Scanner;
public class studikasusjobsheet6{
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int suhu;
        String hujan;
        System.out.print(" Masukkan suhu :  ");
        suhu= input04.nextInt();
        input04.nextLine();

        System.out.print(" Apakah hujan  (ya/tidak) ? ");
        hujan= input04.nextLine();

        if (suhu > 27) {
            System.out.println(" Memakai dress ");  
        
        if (hujan.equals("ya")) {
            System.out.println(" Membawa Payung ");  
        } else 
            System.out.println(" Memakai Sunscreen ");
        } else 
            System.out.println(" Memakai celana panjang ");
        }
    }
