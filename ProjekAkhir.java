import java.util.Scanner;
/**
 * ProjekAkhir 
 * Group Member : 1. Bayu
 *                2. Hammam
 *                3. Ridho
 */
public class ProjekAkhir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, apprvOrRejct = "\t *PERMINTAAN TELAH DISETUJUI*";
        double loanAmnt;
        int loanTrm;

        System.out.println("######### W E L C O M E to K R E D I T  B A N K ##########");
        System.out.println("");
        System.out.print("Masukan Nama lengkap: ");
        nama = input.nextLine();
        System.out.print("Berapa jumlah pinjaman anda: Rp.");
        loanAmnt = input.nextDouble();
        System.out.print("Waktu pengembalian berapa bulan: ");
        loanTrm = input.nextInt();

        double bunga = 5.0/100, sisaSaldo, bungaBulanan, angsuranBlnan;
        String yes;
        System.out.print("Jumlah saldo anda: Rp.");
        sisaSaldo = input.nextFloat();

        bungaBulanan = sisaSaldo * bunga;
        System.out.println("Bunga perbulan anda: Rp."+bungaBulanan);
        angsuranBlnan = loanAmnt / loanTrm + bungaBulanan;

        System.out.println("Angsuran bulanan anda adalah: Rp."+angsuranBlnan+ " perbulan");
        System.out.print("Apakah anda bersedia membayar? ");
        yes = input.next();
        System.out.println("");
        System.out.println("\t PERMINTAAN PINJAMAN TELAH DISETUJUI");
        System.out.println("\t###### T E R I M A   K A S I H ######");



                


    }
}