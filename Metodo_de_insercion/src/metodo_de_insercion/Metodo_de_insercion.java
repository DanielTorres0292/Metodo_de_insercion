package metodo_de_insercion;

public class Metodo_de_insercion {
    
    public static void main(String[] args) {
        
        int[] arreglo = {8, 3, 5, 1, 4};
        
        System.out.println("--- METODO DE INSERCION ---");
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        
        ordenarInsercion(arreglo);
        
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }
    
    public static void ordenarInsercion(int[] arreglo) {
        int n = arreglo.length;
        
        for (int i = 1; i < n; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = clave;
        }
    }
    
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println();
    }
}
