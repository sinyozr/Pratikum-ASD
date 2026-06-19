public class BinaryTreeArray06 {
    Mahasiswa06[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray06() {
        this.dataMahasiswa = new Mahasiswa06[10];
    }

    void populateData(Mahasiswa06 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // 4. Tambah Method
    // Method add() untuk memasukkan data ke dalam array tree
    public void add(Mahasiswa06 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Kapasitas array tree penuh!");
            return;
        }
        idxLast++; // Geser indeks terakhir ke sebelahnya
        dataMahasiswa[idxLast] = data; // Masukkan data baru di tempat tersebut
    }

    // Method traversePreOrder() 
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); 
                traversePreOrder(2 * idxStart + 1);        
                traversePreOrder(2 * idxStart + 2);        
            }
        }
    }
}