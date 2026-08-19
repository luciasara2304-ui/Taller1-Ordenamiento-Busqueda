import java.util.Arrays;

public class MisAlgoritmos implements Ordenamientos, Busquedas {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {

        for (int i = 0; i < arrayPorExplorar.length; i++){
            if(arrayPorExplorar[i] == elementoABuscar){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {

        Arrays.sort(arrayPorExplorar);

        int inicio = 0;
        int fin = arrayPorExplorar.length -1;

        while (inicio <= fin){
            int medio = inicio + (fin-inicio)/2;

            if (arrayPorExplorar[medio] == elementoABuscar){
                return medio;
            }

            if (arrayPorExplorar[medio] < elementoABuscar){
                inicio = medio + 1;
            }
            else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int n = arrayDesordenado.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arrayDesordenado[j] > arrayDesordenado[j+1]){

                    int aux = arrayDesordenado[j];
                    arrayDesordenado[j] = arrayDesordenado[j+1];
                    arrayDesordenado[j+1] = aux;

                }
            }
        }
        return arrayDesordenado;
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
