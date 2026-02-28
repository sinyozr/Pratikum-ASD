import java.util.Scanner;

public class MatakuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah06[] arrayMataKuliah06 = new Matakuliah06[jumlah];

        for (int i = 0; i < arrayMataKuliah06.length; i++) {
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            arrayMataKuliah06[i] = new Matakuliah06("", "", 0, 0);
            arrayMataKuliah06[i].tambahData();
        }
        
        
        System.out.println("\n===== DATA MATA KULIAH =====");
        for (int i = 0; i < arrayMataKuliah06.length; i++) {
            System.out.println("\nData Matakuliah ke-" + (i + 1));
            arrayMataKuliah06[i].cetakInfo();
        }

        sc.close();
    }
}