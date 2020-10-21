import java.util.Random;

public class Dado implements Runnable{
    Random random = new Random();
    protected int contador[] = new int[6];
    int total;


    @Override
    public synchronized void run() {
        int resultado;

        for (int i = 0; i < 10000; i++) {

            resultado = random.nextInt(6) + 1;

            suma(resultado);

            total++;
        }
    }


    protected synchronized void suma(int tirada) {
        contador[tirada - 1]++;
    }


    protected void imprimir() {

        for (int i = 0; i < 6; i++) {
            System.out.printf("Numero %d : %d veces \n", i + 1, contador[i]);

        }
        System.out.printf("Total de veces: %d + %d + %d + %d + %d + %d = %d",contador[0],contador[1],contador[2],contador[3],contador[4],contador[5],total);
    }



}
