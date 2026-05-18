public class PesananDLL06 {
    public NodePesanan06 head;
    public NodePesanan06 tail;

    public PesananDLL06() {
        head = null;
        tail = null;
    }

    public void tambahPesanan(Pesanan06 pesanan) {
        NodePesanan06 newNode = new NodePesanan06(pesanan);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortByNamaPesanan() {
        if (head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            NodePesanan06 current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan06 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
        System.out.println("\n==============================");
        System.out.println("LAPORAN PESANAN ROYAL DELISH");
        System.out.println("==============================");
        sortByNamaPesanan();
        System.out.printf("%-15s %-25s %-10s %s%n", "Kode", "Nama Pesanan", "Harga", "Pembeli");
        NodePesanan06 current = head;
        while (current != null) {
            System.out.printf("%-15d %-25s %-10d %s%n",
                    current.pesanan.kodePesanan,
                    current.pesanan.namaPesanan,
                    current.pesanan.harga,
                    current.pesanan.namaPembeli);
            current = current.next;
        }
    }
}