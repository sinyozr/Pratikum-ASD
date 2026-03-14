import java.util.Scanner;

public class SumMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Disesuaikan agar sama dengan teks di gambar
        System.out.print("Masukkan jumlah elemen: ");
        int elm = sc.nextInt();

        // Instansiasi objek sum
        Sum06 sm = new Sum06(elm);

        // Input keuntungan setiap bulan
        for (int i = 0; i < sm.elemen; i++) {
            // Teks disesuaikan: "Masukkan keuntungan ke-X: "
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        // Output hasil perhitungan sesuai format gambar
        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF(sm.keuntungan));
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

        sc.close();
    }
}