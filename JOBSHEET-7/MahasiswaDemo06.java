
import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = Integer.parseInt(sc.nextLine());

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa06 m = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();

        }

        list.bubbleSort();
        list.tampil();

        System.out.println("================================");
        System.out.println("\nPencarian Data");
        System.out.println("================================");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("==================================");
        System.out.println("\nMenggunakan Binary Search");
        System.out.println("==================================");

        int posisi2 = list.findBinarySearch(cari, 0, n - 1);

        list.tampilPosisi(cari, posisi2);
        list.tampilData(cari, posisi2);

        sc.close();
    }
}