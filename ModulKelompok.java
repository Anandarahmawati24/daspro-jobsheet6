import java.util.Scanner;

public class ModulKelompok {
    public static void main(String[] args) {
        int MCW, MWE, tot;
        String Hasil;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai tugas kuliah (MCW) : ");
        MCW = Sc.nextInt();
        System.out.print("Masukkan Nilai ujian tertulis (MWE) : ");
        MWE = Sc.nextInt();
        
        tot = MCW + MWE;

        if (MCW > 20) {
            if (MWE > 20) {
                if (tot > 45) {
                    Hasil = "LULUS";
                } else if (tot == 44) {
                    tot = 45;
                    Hasil = "GAGAL";
                } else {
                    Hasil = "GAGAL";
                }
            } else if (tot == 45) {
                tot = 44;
                Hasil = "GAGAL TEKNIS";
            } else {
                Hasil = "GAGAL";
            }
        } else if (MWE > 20) {
            if (tot > 45) {
                tot = 44;
                Hasil = "GAGAL TEKNIS";
            } else {
                Hasil = "GAGAL";
            }
        } else {
            Hasil = "GAGAL";
        } 
        System.out.println("Total : " + tot);
        System.out.println("hasil : " + Hasil);
Sc.close();
}
}