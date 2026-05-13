public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;
    int size;

    public DoubleLinkedList06() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return size;
    }

    public void addFirst(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++; 
    }

    public void addLast(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa06 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks " + index + " tidak valid. Ukuran list saat ini: " + size);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }
        Node06 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node06 newNode = new Node06(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++; 
    }
    public void insertAfter(String keyNim, Mahasiswa06 data) {
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current == tail) {
            addLast(data);
        } else {
            Node06 newNode = new Node06(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current == tail || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + ".");
            return;
        }
        Node06 toDelete = current.next;
        System.out.println("Data yang berhasil dihapus:");
        toDelete.data.tampil();
        System.out.println("--------------------");
        if (toDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }

        toDelete.next = null;
        toDelete.prev = null;
        size--; 
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Indeks " + index + " tidak valid. Ukuran list saat ini: " + size);
            return;
        }

        if (index == 0) {
            System.out.println("Data yang berhasil dihapus:");
            head.data.tampil();
            System.out.println("--------------------");
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return;
        }

        if (index == size - 1) {
            System.out.println("Data yang berhasil dihapus:");
            tail.data.tampil();
            System.out.println("--------------------");
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
        Node06 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data yang berhasil dihapus:");
        current.data.tampil();
        System.out.println("--------------------");

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.next = null;
        current.prev = null;
        size--;
    }

    public Mahasiswa06 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data pertama.");
            return null;
        }
        return head.data;
    }

    public Mahasiswa06 getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data terakhir.");
            return null;
        }
        return tail.data;
    }
    public Mahasiswa06 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return null;
        }

        if (index < 0 || index >= size) {
            System.out.println("Indeks " + index + " tidak valid. Ukuran list saat ini: " + size);
            return null;
        }

        Node06 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node06 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
        }
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node06 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("-----------------------------------");
            current = current.prev;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil();
        System.out.println("--------------------");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();
        System.out.println("--------------------");
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--; 
    }
}