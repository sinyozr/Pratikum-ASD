public class Faktorial06 {

    // method brute force (BF)
    // int faktorialBF(int n) {
    // int fakto = 1;
    // for (int i = 1; i <= n; i++) {
    // fakto = fakto * i;
    // }
    // return fakto;
    // }

    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }

    // Method Divide and Conquer (DC)
    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            // proses rekrusif: n * (n-1)
            return n * faktorialDC(n - 1);
        }
    }

}