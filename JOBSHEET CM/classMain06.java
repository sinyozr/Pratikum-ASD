import java.util.Scanner;
public class classMain06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa06[] mhs = {
            new Mahasiswa06("22001", "Andi", " Teknik Informatika"),
            new Mahasiswa06("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa06("22003", "Citra", "SIstem Informasi")
        };
        Buku06[] buku = {
            new Buku06("B001", "Algoritma", 2020),
            new Buku06("B002", "Basis Data", 2019),
            new Buku06("B003", "Pemrograman ", 2021),
            new Buku06("B004", "Fisika", 2024),
        };
        Peminjaman06[] peminjaman = {
            new Peminjaman06(mhs[0], buku[0], 7),
            new Peminjaman06(mhs[1], buku[1], 3),
            new Peminjaman06(mhs[2], buku[2], 10),
            new Peminjaman06(mhs[2], buku[3], 6),
            new Peminjaman06(mhs[0], buku[1], 4),
        };

        int pilihan;
        do {
        System.out.println(" \n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println(" 1. Tampilkan Mahasiswa");
        System.out.println(" 2. Tampilkan Buku");
        System.out.println(" 3. Tampilkan Peminjaman");
        System.out.println(" 4. Urutkan Berdasarkan Denda");
        System.out.println(" 5. Cari Berdasarkan NIM");
        System.out.println(" 6. Keluar");
        System.out.print(" Pilih menu: ");
        pilihan = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        switch (pilihan) {
            case 1:
                System.out.println("\nDaftar Mahasiswa:");
                for (Mahasiswa06 m : mhs) {
                    m.tampilMahasiswa();
                }
                break;
            case 2:
                System.out.println("\nDaftar Buku:");
                for (Buku06 b : buku) {
                    b.tampilBuku();
                }
                break;
            case 3:
                System.out.println("\nDaftar Peminjaman:");
                for (Peminjaman06 p : peminjaman) {
                    p.tampilPinjaman();
                }
                break;
            case 4:
                System.out.println("\nPeminjaman Urut Berdasarkan Denda:");
                java.util.Arrays.sort(peminjaman, (p1, p2) -> Integer.compare(p2.denda, p1.denda));
                for (Peminjaman06 p : peminjaman) {
                    p.tampilPinjaman();
                }
                break;
            case 5:
                System.out.print("Masukkan NIM yang ingin dicari: ");
                String nimCari = sc.nextLine();
                boolean ditemukan = false;
                for (Peminjaman06 p : peminjaman) {
                    if (p.mhs.nim.equals(nimCari)) {
                        p.tampilPinjaman();
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("NIM tidak ditemukan.");
                }
                break;
            case 6:
                System.out.println("Terima kasih telah menggunakan sistem ini.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    } while (pilihan != 6);
}
}