public class StackKoneversi06 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKoneversi06() {
        this.size = 32; // asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan data lagi.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Stack kosong! Tidak ada data untuk dipop.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return tumpukanBiner[top];
        } else {
            System.out.println("Stack kosong! Tidak ada data untuk dilihat.");
            return -1;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(tumpukanBiner[i]);
        }
        System.out.println();
    }
}
