//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] miArray = {70,12,19,45,11,33,26};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

                System.out.println("Lineal: " + misAlgoritmos.linearSearch(miArray, 45));
                System.out.println("Ordenado por bubbleSort: " + java.util.Arrays.toString(misAlgoritmos.bubbleSort(miArray)));
                System.out.println("Binaria: " + misAlgoritmos.binarySearch(miArray, 45)); // miArray ya se ordenó arriba
                System.out.println("Ordenado por selectionSort: " + java.util.Arrays.toString(misAlgoritmos.selectionSort(miArray)));

            }

        }

