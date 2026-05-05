import java.util.Scanner;

public class MainKRS06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS06 antrian = new AntrianKRS06(10); // Maksimal antrian 10
        int pilih;

        do {
            System.out.println("\n-- Menu Antrian KRS --");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil/Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Statistik (Jumlah & Sisa)");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    antrian.tambahAntrian(new MahasiswaKRS06(nim, nama, "TI", "1A"));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.size);
                    System.out.println("Sudah KRS: " + antrian.totalSelesai);
                    System.out.println("Sisa belum KRS (Target 30): " + antrian.getSisaTargetDPA());
                    break;
                case 7:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}