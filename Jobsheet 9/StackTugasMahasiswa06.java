public class StackTugasMahasiswa06 {
    Mahasiswa06[] stack;
    int top;
    int size;

    public StackTugasMahasiswa06(int size){
        this.size =size;
        stack = new Mahasiswa06[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1 ){
            return true;
        }else{
            return false;
        }
    }

    public void push(Mahasiswa06 mhs) {
        if (!isFull()){
            top++;
            stack[top] = mhs;
        }else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa06 pop(){
        if (!isEmpty()){
            Mahasiswa06 m = stack[top];
            top--;
            return m;
        }else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa06 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dilihat.");
            return null;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}

