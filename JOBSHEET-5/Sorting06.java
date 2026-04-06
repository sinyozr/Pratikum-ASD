public class Sorting06 {
    int data[];
    int jmlData;

    // konstruktor
    public Sorting06(int dt[], int jml) {
        data = dt;
        jmlData = jml;
    }

    // method tampil
    public void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // bubble sort
    public void bubbleSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 0; j < jmlData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }
    public void selectionSort(){
        for (int i = 0; i<jmlData-1; i++){
            int min = i;
            for (int j = i+1; j<jmlData; j++){
                if (data[j] < data[min]){
                    min = j;
                }
            }
            int tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
        }
    }
    public void insertionSort(){
        for (int i = 1; i < data.length; i++){
        int temp = data[i];
        int j = i - 1;
        while (j >= 0 && data[j] > temp){
            data[j+1] = data[j];
            j--;
        }
        data[j+1] = temp;
    }
}
}


    