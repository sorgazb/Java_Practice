package unidad6.teoriaU6;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FechasHoras {

	public static void main(String[] args) {
		//Fechas con Date:
		Date fecha= new Date();
		System.out.println(fecha);
		
		
		//Fechas con LocalDate:
		LocalDate fecha2= LocalDate.now();
		System.out.println(fecha2);
		System.out.println(fecha2.getDayOfWeek());
		Month mes= fecha2.getMonth();
		System.out.println("Mes:"+mes.getValue());
		System.out.println("Mes:"+fecha2.getMonthValue());
		System.out.println("Día:"+fecha2.getDayOfMonth());
		//Fechas Pasadas con LocalDate:
		LocalDate fechaPasado= LocalDate.of(2002,11, 20);
		System.out.println(fechaPasado);
		//Como añadir a fechas futuros valores de dd/mm/aa
		LocalDate fechaFuturo=fechaPasado.plusYears(40);
		System.out.println(fechaFuturo);
		
		
		//Formateador de fechas y horas(consultar lib DateTimeFormatter para simbologia):
		DateTimeFormatter formatoFecha= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		/*
		 * Por ejemplo el formato para la fecha de caducidad de tarjetas bancarias, productos...
		 * DateTimeFormatter formatoFecha= DateTimeFormatter.ofPattern("MM/yy");
		 */
		String fechaFormateada= fechaFuturo.format(formatoFecha);
		System.out.println("Fecha Futura Formateada:"+fechaFormateada);
		
		DateTimeFormatter formatoFecha2= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaLocal= LocalDate.parse("25/12/2023",formatoFecha2);
		System.out.println(fechaLocal.format(formatoFecha2));
		
		/*
		 * ---------------------------------------------------------------------------------------
		 */
		
		//Tiempo Horas:
		LocalTime tiempo= LocalTime.now();
		System.out.println(tiempo);
		System.out.println("Hora: "+tiempo.getHour());
		System.out.println("Minuto: "+tiempo.getMinute());
		//Como aumentar a una hora los distintos valores que conforman la hora.
		System.out.println("Hora despúes de 3 horas: "+tiempo.plusHours(3).getHour());
		
		//Fecha y Hora
		LocalDateTime fechaHoraActual= LocalDateTime.now();
		System.out.println("Fecha y Hora Actual:"+fechaHoraActual);
		
		LocalDateTime fechaHoraRecreo= LocalDateTime.of(2024,1,10,11,15);
		System.out.println("Recreo: "+fechaHoraRecreo);
		
		DateTimeFormatter formatoFechaHora= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String fechaHoraFormateada= fechaHoraRecreo.format(formatoFechaHora);
		System.out.println("Fecha y Hora Recreo Formateada: "+fechaHoraFormateada);
		
		
		
		/*
		 * Periodo y Duración:
		 */
		LocalDateTime inicio= LocalDateTime.now();
		LocalDateTime fin= inicio.plusHours(2).plusMinutes(30);
		Duration duracion= Duration.between(inicio, fin);
		System.out.println("Duración entre dos horas:(segundos) "+duracion.getSeconds());
	}

}
