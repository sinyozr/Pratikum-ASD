import java.util.Scanner;

public class QueueMain06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueLinkedList06 antrian = new QueueLinkedList06();

        int pilihan;

        System.out.println("=== SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");

        // Loop utama
        do {
            // Tampilkan menu pilihan
            System.out.println("\n--- MENU ANTRIAN ---");
            System.out.println("1. Daftar / Tambah Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan (Peek Front)");
            System.out.println("5. Tampilkan Antrian Terakhir (Peek Rear)");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Jumlah Mahasiswa Mengantre");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang sisa newline
            System.out.println();

            // Proses pilihan menu
            if (pilihan == 1) {
                // Mahasiswa mendaftar dan masuk ke antrian (enqueue)
                System.out.println("=== PENDAFTARAN ANTRIAN ===");
                if (antrian.isFull()) {
                    System.out.println("Antrian sudah penuh! Tidak bisa mendaftar.");
                } else {
                    // Baca data mahasiswa dari keyboard
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); // buang sisa newline

                    // Buat objek mahasiswa lalu masukkan ke antrian
                    MahasiswaaQ06 mhs = new MahasiswaaQ06(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                }

            } else if (pilihan == 2) {
                // Panggil mahasiswa terdepan dari antrian (dequeue)
                System.out.println("=== PANGGIL ANTRIAN ===");
                MahasiswaaQ06 dipanggil = antrian.dequeue();
                if (dipanggil != null) {
                    // Tampilkan detail mahasiswa yang baru dipanggil
                    System.out.println("Detail mahasiswa yang dipanggil:");
                    dipanggil.tampilInformasi();
                }

            } else if (pilihan == 3) {
                // Tampilkan seluruh isi antrian (traverse dari head ke tail)
                antrian.tampilAntrian();

            } else if (pilihan == 4) {
                // Lihat mahasiswa paling depan tanpa menghapus (peek front)
                antrian.peekFront();

            } else if (pilihan == 5) {
                // Lihat mahasiswa paling belakang tanpa menghapus (peek rear)
                antrian.peekRear();

            } else if (pilihan == 6) {
                // Cek apakah antrian kosong
                if (antrian.isEmpty()) {
                    System.out.println("Status: Antrian KOSONG.");
                } else {
                    System.out.println("Status: Antrian TIDAK kosong. Ada " +
                            antrian.jumlahAntrian() + " mahasiswa.");
                }

            } else if (pilihan == 7) {
                // Cek apakah antrian penuh (sudah mencapai batas maksimum)
                if (antrian.isFull()) {
                    System.out.println("Status: Antrian PENUH.");
                } else {
                    System.out.println("Status: Antrian BELUM penuh. " +
                            antrian.jumlahAntrian() + " dari 10 slot terpakai.");
                }

            } else if (pilihan == 8) {
                // Tampilkan berapa banyak mahasiswa yang masih antri
                System.out.println("Jumlah mahasiswa yang masih mengantre: " +
                        antrian.jumlahAntrian() + " orang.");

            } else if (pilihan == 9) {
                // Kosongkan seluruh antrian (reset ke kondisi awal)
                System.out.print("Yakin ingin mengosongkan antrian? (y/n): ");
                String konfirmasi = sc.nextLine();
                if (konfirmasi.equalsIgnoreCase("y")) {
                    antrian.clear();
                } else {
                    System.out.println("Operasi dibatalkan.");
                }

            } else if (pilihan == 0) {
                // Keluar dari program
                System.out.println("Terima kasih. Program selesai.");

            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}