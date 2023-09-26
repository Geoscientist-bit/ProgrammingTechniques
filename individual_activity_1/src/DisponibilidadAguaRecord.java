import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public record DisponibilidadAguaRecord(
String municipio, 
String departamento,
LocalDate fechaAforo
//LocalDateTime horaMuestreo

) {

    
}
