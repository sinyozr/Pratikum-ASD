public class Node06 {
    Mahasiswa06 data;   // Data yanng disimpan
    Node06 prev;        // Pointer ke node sebelumnya
    Node06 next;        // Pointer ke node berikutnya

    // Konstruktor Node
    // Next & prev di set null karena node baru belum terhubung di node manapun
    public Node06 (Mahasiswa06 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}