public class Mahasiswa06 {
    String nama;
    String nim;
    String kelas;
    int nilai;
    
    Mahasiswa06(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
    
}
