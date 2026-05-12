public class NodeQueue06 {
    MahasiswaaQ06 data; // isi node: objek mahasiswa
    NodeQueue06 next; // pointer ke node berikutnya (null jika node terakhir)

    // Constructor: buat node baru dengan data dan pointer next
    public NodeQueue06(MahasiswaaQ06 data, NodeQueue06 next) {
        this.data = data;
        this.next = next;
    }
}