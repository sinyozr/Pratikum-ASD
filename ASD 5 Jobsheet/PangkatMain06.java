import java.util.Scanner;

public class PangkatMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        // Instansiasi Array of Object 
        Pangkat06[] png = new Pangkat06[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();

            // Membuat objek untuk setiap elemen arrY
            png[i] = new Pangkat06(basis, pangkat);
        }

        System.out.println("=====================");

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (int i = 0; i < elemen; i++) {
            //panggil tanpa parameter
            System.out.println(png[i].nilai + "^" + png[i].pangkat + ": " + png[i].pangkatBF());
        }

        System.out.println("=====================");

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (int i = 0; i < elemen; i++) {
            // Untuk DC tetap menggunakan parameter sesuai instruksi awal jobsheet
            System.out.println(
                    png[i].nilai + "^" + png[i].pangkat + ": " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        System.out.println("=====================");

        sc.close();
    }
}