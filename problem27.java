import java.util.Scanner;
public class problem27{

    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int mwc,mwe, tot;
        System.out.println(" input grade for the coursework:  ");
        mwc = input27.nextInt();
        System.out.println(" Input grade for the written exam:  ");
        mwe =input27.nextInt();
        tot = mwc+mwe;
        if (mwe >= 20 && mwc>=20) {
            if (tot>= 45) {
                if (tot == 44) {
                    tot = 45;
                
                System.out.println(" RESULT : PASS ");  
            } else {
                System.out.println(" RESULT : FAIL ");
            }
        } else if (tot == 44) {
            tot = 45;
            System.out.println(" RESULT: PASS ");
        } else {
            System.out.println(" RESULT: TECHNICAL FAIL ");
        }
        System.out.println(" TOTAL SCORE "  +tot );
    }
}
}