public class Peminjaman06{
    Mahasiswa06 mhs;
    Buku06 buku;
    int lamaPinjam;
    int batasPinjam;
    int terlambat;
    int denda;

    public Peminjaman06(Mahasiswa06 mhs, Buku06 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.batasPinjam = 5; // Misalnya, batas peminjaman adalah 7 hari
        hitunDenda();
    }

    public void hitunDenda(){
        if (lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        }else{
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPinjaman(){
         System.out.printf("%-7s | %-12s | Lama: %d | Terlambat: %d | Denda: %d\n",
                mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}