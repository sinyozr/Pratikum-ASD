public class NodeAntrian06 {
    public int noAntrian;
    public Pembeli06 pembeli;
    public NodeAntrian06 prev;
    public NodeAntrian06 next;

    public NodeAntrian06(int noAntrian, Pembeli06 pembeli) {
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.prev = null;
        this.next = null;
    }
}