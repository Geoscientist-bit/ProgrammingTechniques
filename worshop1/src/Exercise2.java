/*
 * Ejercicio 2:
a. Generar el promedio de los números listados a continuación
  40
  50
  60
  24
  66
  12
  98
b. Para cada uno de los números indicar si está por encima o debajo del promedio
 */

public class Exercise2 {
    int[] numbInt = { 40, 50, 60, 24, 66, 12, 98 };
    int sum;
    float average;
    
    public void averageInt() {
        sum = 0;
        for (int numb : numbInt) {
            sum += numb;
        }

        average = sum / numbInt.length;       

        for (int numb : numbInt) {
            if (numb < average) {
                System.out.println(" the average is " + average + " and is above " + numb);
            } else if (numb == average ) {
                System.out.println(" the average is " + average + " and is equal to " + numb);
            } else {
               System.out.println(" the average is " + average + " and is below " + numb); 
            }
        }
        
    }
}
