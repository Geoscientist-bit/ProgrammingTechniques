import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TestDisponibilidadAgua {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DisponibilidadAguaRecord data1 = new DisponibilidadAguaRecord(" Santiago de cali ",
                " Valle del Cauca ", LocalDate.parse(" 15/03/2021 ", DateTimeFormatter.ofPattern(" dd/MM/uuuu ")));

        DisponibilidadAguaRecord data2 = new DisponibilidadAguaRecord(" Medellin ",
                " Antioquia ", LocalDate.parse(" 01/05/2020 ", DateTimeFormatter.ofPattern(" dd/MM/uuuu ")));

        DisponibilidadAguaRecord data3 = new DisponibilidadAguaRecord(" Medellin ",
                " Antioquia ", LocalDate.parse(" 05/10/1999 ", DateTimeFormatter.ofPattern(" dd/MM/uuuu ")));

        DisponibilidadAguaRecord[] dataWithRecord = new DisponibilidadAguaRecord[3];
        dataWithRecord[0] = data1;
        dataWithRecord[1] = data2;
        dataWithRecord[2] = data3;

        for (DisponibilidadAguaRecord disponibilidadAguaRecord : dataWithRecord) {
            //System.out.println(disponibilidadAguaRecord);
            long anosDiferencia = ChronoUnit.YEARS.between(LocalDate.now(), disponibilidadAguaRecord.fechaAforo());
            long diasDiferencia = ChronoUnit.DAYS.between(LocalDate.now(), disponibilidadAguaRecord.fechaAforo());

            System.out.println(disponibilidadAguaRecord.fechaAforo() + " " + anosDiferencia + " " + diasDiferencia);
        }

        // System.out.println(data1);
        // System.out.println(data1.getClass().getSimpleName());
    }
}
