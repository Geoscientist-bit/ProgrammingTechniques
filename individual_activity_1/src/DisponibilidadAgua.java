/*
 * Basado en la meta 6 de agua limpia y saneamiento se tomo 20 ubicaciones con disponilidad de agua 
 * de los cuales determino el promedio de agua que generan estas ubicaciones, la ubicacicón con mayor disponibilidd
 * y la de menor disponibilidad.
 * 
 * esto con el objetivo de determinar las ubcaciones que pueden satisfacer la demanda de mas de 100 personas, teniendo
 * en cuenta que solo las ubicaciones que tenga disponibilidad mayor a 15 litros puede satisfacer esta necesidad
 */

import java.util.ArrayList;

public class DisponibilidadAgua {

    public static void main(String[] args) {
        // Crear un arreglo para representar la disponibilidad de agua en 20 ubicaciones
        double[] disponibilidadAgua = new double[20];
        double suma = 0.0, promedio = 0.0;
        ArrayList<Integer> ubicacionesCumplen = new ArrayList<>();

        // Llenar el arreglo con valores de disponibilidad de agua 
        for (int i = 0; i < disponibilidadAgua.length; i++) {
            disponibilidadAgua[i] = Math.random() * 100; // Valores aleatorios entre 0 y 100
        }

        // Imprimir la disponibilidad de agua en cada ubicación
        System.out.println("Disponibilidad de agua en cada ubicación:");
        System.out.println("------------------------------------------");
        double mayor = disponibilidadAgua[0];
        double menor = disponibilidadAgua[0];
        int ubi1 = 0, ubi2 = 0;

        for (int i = 0; i < disponibilidadAgua.length; i++) {
            System.out.println("Ubicación " + (i + 1) + ": " + disponibilidadAgua[i] + " litros\n");

            if (mayor < disponibilidadAgua[i]) {
                mayor = disponibilidadAgua[i];
                ubi1 = i;
            }

            if (menor > disponibilidadAgua[i]) {
                menor = disponibilidadAgua[i];
                ubi2 = i;
            }

           

            suma += disponibilidadAgua[i];

        }
        
        for (int ubicacionCumple : ubicacionesCumplen) {
            if (ubicacionCumple >= 15.0) {
                ubicacionesCumplen.add(ubicacionCumple);
                System.out.println(" la ubicacion " +  ubicacionCumple + " puede abastecer mas de 100 personas\n");
            }
            
            //System.out.println(ubicacionCumple);
        }

        promedio = suma / disponibilidadAgua.length;

        System.out.println("La ubicacion  " +  ubi1 + " presenta la mayor disponibilidad con " + mayor + " litros\n");

        System.out.println("La ubicacion  " +  ubi2 + " presenta la menor disponibilidad con " + menor + " litros\n");
        
        System.out.println("--> El promedio de disponidad de agua es: " + promedio + "\n");

       
    }
}
