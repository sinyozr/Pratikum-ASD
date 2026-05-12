public class NodeMahasiswa06 {

    Mahasiswa06 data; // Menyimpan data mahasiswa
    NodeMahasiswa06 next; // Menyimpan alamat node selanjutnya 

    // Konstrukror untuk membuat node baru
    public NodeMahasiswa06(Mahasiswa06 data, NodeMahasiswa06 next) {
        this.data = data; //Isi data mahasiswanya
        this.next = next; //Hubungkan ke node berikutnya
    }
    
}