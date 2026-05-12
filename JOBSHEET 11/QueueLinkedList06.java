public class QueueLinkedList06 {
    NodeQueue06 head; // pointer ke node paling depan (yang akan dipanggil duluan)
    NodeQueue06 tail; // pointer ke node paling belakang (tempat masuk antrian baru)
    int size; // jumlah mahasiswa yang sedang antri
    int MAX_SIZE = 10; // batas maksimum antrian

    // Mengecek apakah antrian kosong (head null = tidak ada node)
    boolean isEmpty() {
        return (head == null);
    }

    // Mengecek apakah antrian sudah penuh (jumlah node >= batas)
    boolean isFull() {
        return (size >= MAX_SIZE);
    }

    // Mengosongkan seluruh antrian: reset head, tail, dan size ke kondisi awal
    void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menambahkan mahasiswa ke belakang antrian (enqueue)
    void enqueue(MahasiswaaQ06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan data.");
            return;
        }
        NodeQueue06 newNode = new NodeQueue06(mhs, null); // buat node baru
        if (isEmpty()) {
            head = newNode; // jika kosong, head dan tail = node baru
            tail = newNode;
        } else {
            tail.next = newNode; // sambungkan tail lama ke node baru
            tail = newNode; // geser tail ke node baru
        }
        size++; // tambah hitungan antrian
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian (No. " + size + ").");
    }

    // Memanggil dan menghapus mahasiswa dari depan antrian (dequeue / FIFO)
    MahasiswaaQ06 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return null;
        }
        MahasiswaaQ06 dipanggil = head.data; // simpan data head sebelum dihapus
        if (head == tail) {
            head = tail = null; // hanya satu node tersisa, kosongkan list
        } else {
            head = head.next; // geser head ke node berikutnya
        }
        size--; // kurangi hitungan antrian
        System.out.println("Memanggil mahasiswa: " + dipanggil.nama);
        return dipanggil;
    }

    // Menampilkan mahasiswa paling depan antrian tanpa menghapusnya (peek front)
    void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilInformasi(); // tampilkan data head
        }
    }

    // Menampilkan mahasiswa paling belakang antrian tanpa menghapusnya (peek rear)
    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            tail.data.tampilInformasi(); // tampilkan data tail
        }
    }

    // Mengembalikan jumlah mahasiswa yang masih antri
    int jumlahAntrian() {
        return size;
    }

    // Menampilkan seluruh isi antrian dari depan ke belakang (traverse)
    void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Isi Antrian (Total: " + size + " mahasiswa):");
        NodeQueue06 tmp = head; // mulai traverse dari head (depan antrian)
        int no = 1;
        while (tmp != null) { // selama masih ada node
            System.out.print(no + ". ");
            tmp.data.tampilInformasi();
            tmp = tmp.next; // pindah ke node berikutnya
            no++;
        }
        System.out.println();
    }
}