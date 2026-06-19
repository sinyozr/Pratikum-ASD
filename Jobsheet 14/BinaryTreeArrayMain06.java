public class BinaryTreeArrayMain06 {
    public static void main(String[] args) {
        BinaryTreeArray06 bta = new BinaryTreeArray06();
        
        Mahasiswa06 mhs1 = new Mahasiswa06("244160121", "Ali", "A", 3.57);
        Mahasiswa06 mhs2 = new Mahasiswa06("244160185", "Candra", "C", 3.41);
        Mahasiswa06 mhs3 = new Mahasiswa06("244160221", "Badar", "B", 3.75);
        Mahasiswa06 mhs4 = new Mahasiswa06("244160220", "Dewi", "B", 3.35);
        Mahasiswa06 mhs5 = new Mahasiswa06("244160131", "Devi", "A", 3.48);
        Mahasiswa06 mhs6 = new Mahasiswa06("244160205", "Ehsan", "D", 3.61);
        Mahasiswa06 mhs7 = new Mahasiswa06("244160170", "Fizi", "B", 3.86);

        Mahasiswa06[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}