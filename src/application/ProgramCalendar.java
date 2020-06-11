package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-06-11T13:47:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Mês: " + mes);
		//System.out.println(sdf.format(d));
	}

}
