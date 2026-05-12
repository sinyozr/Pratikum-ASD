public class MahasiswaaQ06 {
    
    // Atribut data mahasiswa
    String nim;
    String nama;
    String kelas;
    double ipk;
 
    // Constructor kosong (default)
    public MahasiswaaQ06() {
    }
 
    // Constructor berparameter: langsung mengisi semua atribut
    public MahasiswaaQ06(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }
 
    // Mencetak data mahasiswa dalam satu baris dengan format tabel
    public void tampilInformasi() {
        System.out.printf("| %-12s | %-15s | %-6s | %.2f |%n",
                nim, nama, kelas, ipk);
    }
}