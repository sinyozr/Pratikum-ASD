public class AntrianKRS06 {
    MahasiswaKRS06[] data;
    int front, rear, size, max;
    int totalSelesai = 0;
    final int targetDPA = 30;

    public AntrianKRS06(int n) {
        max = n;
        data = new MahasiswaKRS06[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(MahasiswaKRS06 mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public void prosesKRS() {
        if (size == 0) {
            System.out.println("Tidak ada antrian.");
            return;
        }
        // Melayani hingga 2 mahasiswa sekaligus
        int jumlahDiproses = (size >= 2) ? 2 : 1;
        System.out.println("Memproses KRS untuk " + jumlahDiproses + " mahasiswa:");
        for (int i = 0; i < jumlahDiproses; i++) {
            System.out.print("Selesai: ");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalSelesai++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            for (int i = 0; i < size; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void lihatDuaTerdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else {
            int limit = (size >= 2) ? 2 : 1;
            for (int i = 0; i < limit; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (!isEmpty())
            data[rear].tampilkanData();
        else
            System.out.println("Antrian kosong.");
    }

    public int getSisaTargetDPA() {
        return targetDPA - totalSelesai;
    }
}