public class Main {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Contatore(1, 5));
        Thread thr2 = new Thread(new Contatore(2, 5));
        Thread thr3 = new Thread(new Contatore(3, 5));

        thr1.start();
        thr2.start();
        thr3.start();

        thr1.join();
        thr2.join();
        thr3.join();

    }
}