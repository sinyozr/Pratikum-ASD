public class SLLMain06 {

    public static void main(String[] args) {

        SingleLinkedList06 sll = new SingleLinkedList06();

        // 4 objek mahasiswa dengan data masing-masing
        Mahasiswa06 mhs1 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa06 mhs2 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        Mahasiswa06 mhs3 = new Mahasiswa06("22212202", "Cintia", "3C", 3.5);
        Mahasiswa06 mhs4 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);

        // Cetak sebelum ada data akan tampil "Linked list kosong"
        sll.print();
        // Tambah mhs4 (Dirga) di depan, lalu cetak
        sll.addFirst(mhs4);
        sll.print();
        // Tambah mhs1 (Alvaro) di belakang, lalu cetak
        sll.addLast(mhs1);
        sll.print();
        // sisipkan mhs3
        sll.InsertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // ===============================================================
        // 2.2 Modifikasi Elemen pada Single Linked List
        // Tampilkan data pada indeks ke-1
        System.out.println("data index 1 : ");
        sll.getData(1);

        // Cari dan tampilkan indeks dari mahasiswa bernama "bimon"
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        // Hapus node pertama (Dirga) dan node terakhir (Alvaro)
        sll.removeFirst();
        sll.removeLast();
        sll.print();

        // Hapus node indeks 0
        sll.removeAt(0);
        sll.print();

    }

}

// MODIF MENGGUNAKAN SCANNER
// import java.util.Scanner;

// public class SLLMain06 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// SingleLinkedList18 sll = new SingleLinkedList18();

// System.out.print("Masukkan jumlah mahasiswa: ");
// int jml = sc.nextInt();
// sc.nextLine(); // Pembersih buffer

// for (int i = 0; i < jml; i++) {
// System.out.println("\nMahasiswa ke-" + (i + 1));
// System.out.print("NIM: ");
// String nim = sc.nextLine();
// System.out.print("Nama: ");
// String nama = sc.nextLine();
// System.out.print("Kelas: ");
// String kelas = sc.nextLine();
// System.out.print("IPK: ");
// double ipk = sc.nextDouble();
// sc.nextLine(); // Pembersih buffer

// // Langsung masukkan ke linked list
// sll.addLast(new Mahasiswa18(nim, nama, kelas, ipk));
// }

// System.out.println("\nHasil Input:");
// sll.print();
// sc.close();
// }
// }