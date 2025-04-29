import java.util.Random;

public class BenchMarking {
    private MetodosOrdenamiento metodosOrdenamiento;

    public BenchMarking() {
        metodosOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(1000000);
        Runnable tarea=()->metodosOrdenamiento.burbujaTradicional(arreglo);
        // long incioMillis=System.currentTimeMillis();
        // long inicioNano=System.nanoTime();
        // System.out.println(incioMillis);
        // System.out.println(inicioNano);
        double tiempoNano=medirconNanoTime(tarea);
        double tiempoCurrent=medirConCurrentTime(tarea);
        System.out.println("Tiempo con nanoTime: "+tiempoNano);
        System.out.println("Tiempo con currentTimeMillis: "+tiempoCurrent);
    }

    private int[] generarArregloAleatorio(int i) {
        int[] arreglo = new int[i];
        Random random = new Random(); 
        for (int j = 0; j < i; j++) {
            arreglo[j] = random.nextInt(100_000);
        }
        return arreglo;
    }

    public double medirconNanoTime(Runnable tarea) {
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        return (fin - inicio) / 1_000_000_000.0;
    }

    public double medirConCurrentTime(Runnable tarea) {
        long incio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return (fin - incio) / 1000.0;
    }
}
