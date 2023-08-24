public class Exercise1 {
    /*
     * Ejercicio 1:
     * a. Convertir las siguientes temperaturas entre celsius (C) a fahrenheit (F):
     * 0C a Fahrenheit
     * 32F a Celsius
     * 100F a Celsius
     * 100C a Fahrenheit
     * 25C a Fahrenheit
     * -10C a Fahrenheit
     * -40F a Celsius
     */

    Double tempCelsius, tempConversionToFarenheit, tempConversionToCelsius;

    public void convTemperatureToFarenheit(double tempCelsius) {
        
        tempConversionToFarenheit = (tempCelsius * 1.8) + 32;
        System.out.println(tempCelsius + "° Celsius" + " to Farenheit is: " + tempConversionToFarenheit + "°");
    }

    public void convTemperatureToCelsius(double tempFarenheit) {

        tempConversionToCelsius = (tempFarenheit - 32) / 1.8;
        System.out.println(tempFarenheit + "° Farenheit" + " to Celsius is: " + tempConversionToCelsius + "°");
    }

    

}
