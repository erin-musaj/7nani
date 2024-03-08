public class Contatore implements Runnable {
    private int count;
    private int nIncr;
    private int nProc;

    public Contatore(int nProc, int nIncr) {
        this.nIncr = nIncr;
        this.nProc = nProc;
    }

    @Override
    public void run() {
        for(int i = 0; i < nIncr; ++i) {
            System.out.println("Contatore " + this.nProc + ": " + this.count++);
        }
    }
}
