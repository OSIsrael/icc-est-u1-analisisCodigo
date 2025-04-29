import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: el metodo retorna un arreglo de enteros vacios linea 21
    // Solucion: cambiar ekl return para que regrese la varibale "arreglo"
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: El metodo esta siendo ordenado de manera descendente linea
    // 32
    // Solucion: cambiar el operador para ordenarlo de manera ascendente

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: En el segundo for la condicion para recorrer el arreglo
    // esta mal ya que para que sea el burbuja mejorado debe ser diferente linea 55.
    // Solucion: cambiar la condicion del segundo for
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: El metodo no devuelve ningun arreglo de tipo entero linea
    // 69, y debe exisitir una condicion para poder hacer el cambio linea 78.
    // Solucion: retornar el arreglo, y adicionar la condicion de cambio.
    public int[] seleccionPrimero(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;
            }
        }
        return arreglo;

    }

    // Método de selección con errores
    // Error encontrado: La condicion del primer for para recorrer el arreglo esta mal linea 99.
    // La condicion de aumento de la variable esta mal linea 102.
    // Falta condicion para el cambio linea 107.
    //Solucion: Poner el tamano del arreglo -1, cambiar j-- por j++,  agregar condicion para cambio
    public int[] seleccionSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length-1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo!=i) {
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber; 
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: No tiene condicion de cambio, y el codigo de cambio es incorrecto, linea 131
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo!=i) {
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;  
            }
            
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Inicio de la variable j linea 146
    //la condicion  del while esta mal 150
    //Solucion: incicializar j=0, y la condicion j>=0
    public int[] insercionPrimero(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 0; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: en el segundo for sigo cambiando la variable j linea 168
    //Solucion: cambiar por i
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];
            int i = j - 1;
            for (;i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: No se incializa la variable i restando 1 linea 187
    // condicion del while, incorrecta line 189
    // dentro del bucle while i debe restarse linea 191
    // se debe retornar la variable arreglo linea 195
    //Solucion: int i=j-1, condion= i>=0 && arreglo[i]>key,i--, return arreglo;
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
