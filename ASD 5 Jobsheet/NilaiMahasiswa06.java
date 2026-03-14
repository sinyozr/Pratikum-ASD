
public class NilaiMahasiswa06 {

    // a. Mencari Nilai UTS Tertinggi (Divide and Conquer)
    public int utsTertinggi(Mahasiswa06[] mhs, int l, int r) {
        if (l == r) { // Base Case
            return mhs[l].nilaiUTS;
        } else {
            int mid = (l + r) / 2;
            int lMax = utsTertinggi(mhs, l, mid);
            int rMax = utsTertinggi(mhs, mid + 1, r);
            return (lMax > rMax) ? lMax : rMax; // combine
        }
    }

    // b. Mencari Nilai UTS Terendah (Divide Conquer)
    public int utsTerendah(Mahasiswa06[] mhs, int l, int r) {
        if (l == r) { // Base Case
            return mhs[l].nilaiUTS;
        } else {
            int mid = (l + r) / 2;
            int lMin = utsTerendah(mhs, l, mid);
            int rMin = utsTerendah(mhs, mid + 1, r);
            return (lMin < rMin) ? lMin : rMin; // combine
        }
    }

    // c. Menghitung Rata-Rata UAS (Brute Force)
    public double rataUAS(Mahasiswa06[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}