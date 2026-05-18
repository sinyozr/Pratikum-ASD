public class AntrianDLL06 {
    public NodeAntrian06 head;
    public NodeAntrian06 tail;
    int counterAntrian;

    public AntrianDLL06() {
        head = null;
        tail = null;
        counterAntrian = 0;
    }

    public int tambahAntrian(Pembeli06 pembeli) {
        counterAntrian++;
        NodeAntrian06 newNode = new NodeAntrian06(counterAntrian, pembeli);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        return counterAntrian;
    }

    public NodeAntrian06 hapusAntrian(int noAntrian) {
        NodeAntrian06 current = head;
        while (current != null) {
            if (current.noAntrian == noAntrian) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                current.prev = null;
                current.next = null;
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian06 current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                    current.noAntrian,
                    current.pembeli.namaPembeli,
                    current.pembeli.noHp);
            current = current.next;
        }
    }

    public NodeAntrian06 cariAntrian(int noAntrian) {
        NodeAntrian06 current = head;
        while (current != null) {
            if (current.noAntrian == noAntrian)
                return current;
            current = current.next;
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}