public class Main {
    private static final int NUMBER_OF_THREADS = 3;

        public static void main(String[] args) {

            Thread[] threads = new Thread[NUMBER_OF_THREADS];
            Dado dado = new Dado();

            for (int i = 0; i < NUMBER_OF_THREADS; i++) {

                threads[i] = new Thread(dado);

            }

            for (int i = 0; i < NUMBER_OF_THREADS; i++) {
                threads[i].start();

            }

            for (int i = 0; i < NUMBER_OF_THREADS ; i++) {

                try {
                    threads[i].join();
                } catch (InterruptedException e) {
                    return;
                }

            }
            dado.imprimir();
        }

    }
