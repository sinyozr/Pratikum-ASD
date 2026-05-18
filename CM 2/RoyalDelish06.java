import java.util.Scanner;

public class RoyalDelish06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDLL06 antrian = new AntrianDLL06();
        PesananDLL06 pesanan = new PesananDLL06();

        antrian.tambahAntrian(new Pembeli06("Ainra", "08224500000"));
        antrian.tambahAntrian(new Pembeli06("Danra", "08224511111"));
        antrian.tambahAntrian(new Pembeli06("Sanri", "08224522222"));

        int pilihan;
        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String inputNama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String inputNoHp = sc.nextLine();
                    Pembeli06 pembeliBaru = new Pembeli06(inputNama, inputNoHp);
                    int nomorAntrian = antrian.tambahAntrian(pembeliBaru);
                    System.out.println("Nomor Antrian Anda: " + nomorAntrian);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        NodeAntrian06 nodeDilayani = antrian.head;
                        System.out.println("Melayani: " + nodeDilayani.pembeli.namaPembeli);
                        System.out.println("No HP: " + nodeDilayani.pembeli.noHp);
                        System.out.print("Kode Pesanan : ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        Pesanan06 pesananBaru = new Pesanan06(kodePesanan, namaPesanan, harga, nodeDilayani.pembeli.namaPembeli);
                        pesanan.tambahPesanan(pesananBaru);
                        NodeAntrian06 nodeDihapus = antrian.hapusAntrian(nodeDilayani.noAntrian);
                        if (nodeDihapus != null) {
                            System.out.println("Antrian " + nodeDihapus.noAntrian + " berhasil dihapus");
                        }
                    }
                    break;
                case 4:
                    pesanan.cetakLaporan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 0);
        sc.close();
    }
}