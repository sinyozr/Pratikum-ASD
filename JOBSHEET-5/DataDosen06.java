public class DataDosen06 {
    Dosen06[] dataDosen = new Dosen06[10];
    int idx;

    // Tambah data
    void tambah(Dosen06 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // Tampil data
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("-----------------------");
        }
    }

    // Sorting ASC (termuda → tertua) pakai Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen06 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    // Sorting DSC (tertua → termuda) pakai Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen06 temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    // Insertion Sort (ASC)
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen06 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
    