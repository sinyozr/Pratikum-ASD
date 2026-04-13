public class Buku06 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    public Object judul;

    public Buku06(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku(){
        System.out.println("Kode Buku: " + kodeBuku +"| judul " + judul + " | Tahun terbit: " + tahunTerbit);
    }
}