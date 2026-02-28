import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mahasiswa06[] arrayOfMahasiswa = new Mahasiswa06[3];
        String dummy;

        for(int i=0; i < 3; i++){
            arrayOfMahasiswa[1] = new Mahasiswa06();

            System.out.println("Masukkan Data Mahasiswa Ke-" + (i +1));
            System.out.print("NIM :");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama :");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas :");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK :");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.print("-------------------------------");
        }

        for(int i=0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM   : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa[i].ipk );
            System.out.println("----------------------------------------");
        }
    }
}
