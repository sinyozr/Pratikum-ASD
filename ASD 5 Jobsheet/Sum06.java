public class Sum06 {
    public int elemen;
    public double keuntungan[];
    public double total;

    // konstruktor untuk inisialisasi jumlah elemen dan array
    Sum06(int el) {
        this.elemen = el;
        this.keuntungan = new double[el];
        this.total = 0;
    }

    // Method total brute force
    double totalBF (double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        } 
        return total;
    }

    // Method total divide and Conquer
    double totalDC(double arr[], int l, int r) {
        if (l == r) { //base case: jika sisa 1 elemen
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2; // divide: membagi menjadi 2 bagian
            double lsum = totalDC(arr, l, mid); //Conquer bagian kiri
            double rsum = totalDC(arr, mid + 1, r); //conquer bagian kanan
            return lsum + rsum; // combine: menjumlahkan hasil kiri dan kanan
        }
        return 0;
    }
}