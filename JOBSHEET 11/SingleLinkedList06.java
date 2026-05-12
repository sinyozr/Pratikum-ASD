public class SingleLinkedList06 {

    NodeMahasiswa06 head; // Penanda node paling depan
    NodeMahasiswa06 tail; // penanda node paling belakang

    // cek apakah list masih kosong
    boolean isEmpty() {
        return (head == null);
    }

    // menampilkan semua isi list
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa06 tmp = head;
            System.out.println("Isi Linked List:\t ");
            while (tmp != null) { // selama belum mencapai ujung list
                tmp.data.tampilInformasi(); // cetak data di node saat ini
                tmp = tmp.next; // geser ke node berikutnya
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong"); // jika head == null
        }

    }

    // Menambah node di posisi paling depan
    public void addFirst(Mahasiswa06 input) {
        // buat node baru (null = belum menunjuk siapapun)
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }

    }

    // Menambah node di posisi paling belakang
    public void addLast(Mahasiswa06 input) {
        // pointer next bernilai null (karena akan jadi yang terakhir)
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // Method InsertAfter
    public void InsertAfter(String key, Mahasiswa06 input) {
        NodeMahasiswa06 ndInput = new NodeMahasiswa06(input, null);
        NodeMahasiswa06 temp = head;

        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    // Method penambahan node pada indeks tertentu
    public void insertAt(int index, Mahasiswa06 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa06 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa06(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    // ===============================================
    // 2.2 Modifikasi Elemen pada Single Linked List
    // ===============================================

    // Mengambil dan menampilkan data mahasiswa pada indeks tertentu
    public void getData(int index) {
        NodeMahasiswa06 tmp = head;
        // sampai index yang dituju
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi(); // Cetak data pada indeks tersebut
    }

    // Mencari indeks node berdasarkan nama (key)
    public int indexOf(String key) {
        NodeMahasiswa06 tmp = head;
        int index = 0;
        // Terus geser selama belum ketemu dan node belum habis
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1; // Nama tidak ditemukan
        } else {
            return index; // Kembalikan posisi indeks
        }
    }

    // Menghapus node pertama (head) dari linked list
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null; // hanya ada satu node, kosongkan list
        } else {
            head = head.next; // geser head ke node berikutnya
        }
    }

    // Menghapus node terakhir (tail) dari linked list
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null; // hanya ada satu node kosongkan list
        } else {
            NodeMahasiswa06 temp = head;
            // traverse sampai satu node sebelum tail
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null; // putuskan sambungan ke tail lama
            tail = temp; // perbarui tail ke node sebelumnya
        }
    }

    // Menghapus node berdasarkan nama (key)
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa06 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    // node yang dicari adalah head hapus liwat removeFirst
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    // lewati node berikutnya (node yang cocok) dara rantai
                    temp.next = temp.next.next;
                    if (temp.next == null) { // Jika node terhapus adalah tail maka
                        tail = temp; // perbarui tail
                    }
                    break; // hentikan loop setelah penghapusan selesai
                }
                temp = temp.next; // lanjut ke node berikutnya
            }
        }
    }

    // Menghapus node pada indeks tertentu
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst(); // indeks 0 = hapus node pertama
        } else {
            NodeMahasiswa06 temp = head;
            // jalnkan sampai satu posisi sebelum indeks tujuan
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            // Lewati node (indeks tujuan)
            temp.next = temp.next.next;
            if (temp.next == null) { // jika node terhapus adalah tail maka
                tail = temp; // perbarui tail
            }
        }
    }

}