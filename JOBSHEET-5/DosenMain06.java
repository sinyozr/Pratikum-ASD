import java.util.Scanner;

public class DosenMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen06 list = new DataDosen06();

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (termuda → tertua)");
            System.out.println("4. Sorting DSC (tertua → termuda)");
            System.out.println("5. Insertion Sort (ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Usia: ");
                    int us = sc.nextInt();
                    sc.nextLine();

                    boolean jenis = (jk == 'L' || jk == 'l');

                    Dosen06 d = new Dosen06(kd, nm, jenis, us);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC");
                    break;

                case 5:
                    list.insertionSort();
                    System.out.println("Data berhasil diurutkan Insertion Sort");
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak ada!");
            }

        } while (pilih != 0);
    sc.close();
    
    }

}