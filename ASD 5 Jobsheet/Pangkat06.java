public class Pangkat06 {
    public int nilai, pangkat;

    // Konstruktor berparameter
    public Pangkat06(int n, int p) {
        nilai = n; 
        pangkat = p;
    }

    // Method Brute Force berparameter
    // public int pangkatBF(int a, int n) {
    //     int hasil = 1;
    //     for (int i = 0; i < n; i++) {
    //         hasil = hasil * a;
    //     }
    //     return hasil; 
    // }

    // Contoh method tanpa parameter
    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }

    // Method Divide and Conquer
    public int pangkatDC(int a, int n) {
        if (n == 0) { // Tambahan: Base case untuk pangkat 0
            return 1;
        } else if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a); //untuk pangkat ganjil
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));  //untuk pangkat genap
            }
        }
    }
}