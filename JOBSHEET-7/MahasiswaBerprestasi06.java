public class MahasiswaBerprestasi06 {
    Mahasiswa06[] listMhs;
    int idx;

    public MahasiswaBerprestasi06(int kapasitas) {
        listMhs = new Mahasiswa06[kapasitas];
        idx = 0;
    }

    void tambah(Mahasiswa06 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk > listMhs[j + 1].ipk) {
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int min = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[min].ipk) {
                    min = j;
                }
            }
            Mahasiswa06 tmp = listMhs[min];
            listMhs[min] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    int sequentialSearching(double cari) {
        for (int i = 0; i < idx; i++) {
            if (Math.abs(listMhs[i].ipk - cari) < 0.01) {
                return i;
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data ditemukan di indeks ke-" + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilData(double x, int pos) {
        if (pos != -1) {
            listMhs[pos].tampilInformasi();
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;

            if (listMhs[mid].ipk == cari) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                 return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}