import java.util.Scanner;

public class DoubleLinkedListMain06 {

    public static Mahasiswa06 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa06(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList06 list = new DoubleLinkedList06();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa06 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    System.out.println("Data berhasil ditambahkan di awal.");
                    break;

                case 2:
                    Mahasiswa06 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    System.out.println("Data berhasil ditambahkan di akhir.");
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();

                    System.out.println("Masukkan data baru:");
                    Mahasiswa06 dataBaru = inputMahasiswa(sc);

                    list.insertAfter(keyNim, dataBaru);
                    System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}