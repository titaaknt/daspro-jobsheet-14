import java.util.Scanner;

public class Modifikasi_Percobaan2 {

    static int hitungPangkat(int x, int y, String deret) {
    
        if (y == 0) {
            System.out.print(deret + "1");  
            return 1;
        } else {
            int result = x * hitungPangkat(x, y - 1, deret + x + "x");  
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.print("hitungPangkat(" + bilangan + "," + pangkat + ") dicetak ");
        int hasil = hitungPangkat(bilangan, pangkat, "");
        
        System.out.println(" = " + hasil);
    }
}
