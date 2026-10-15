public class GiocaNumeri2 {
    public static void main(String[] args) {
        try {
        System.out.println("INIZIO GIOCO");

        Giocatore g1 = new Giocatore("Monica");
        Thread tg1 = new Thread(g1);
        tg1.start();
        tg1.join();

        Giocatore g2 = new Giocatore ("Paolo");
        Thread tg2 = new Thread(g2);
        tg2.start();
        tg2.join();

        System.out.println("FINE GIOCO");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}