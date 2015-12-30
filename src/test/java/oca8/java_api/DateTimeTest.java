package oca8.java_api;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class DateTimeTest {


    @Test
    public void loBasico(){
        LocalDate date1 = LocalDate.now();
        LocalTime time1 = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(date1,time1);

        System.out.println(localDateTime);
        Long epoch = localDateTime.toEpochSecond(ZoneOffset.ofHours(-3));
        System.out.println(epoch);

        date1 = LocalDate.of(1990, Month.DECEMBER, 19);
        assertEquals("1990-12-19",date1.toString());

        time1 = LocalTime.NOON;
        System.out.println(time1);
        assertEquals("12:00",time1.toString());

        localDateTime = LocalDateTime.of(date1, time1);
        assertEquals("1990-12-19T12:00",localDateTime.toString());

    }

    @Test
    public void sonInmutables(){
        LocalDate date1 = LocalDate.MIN;
        LocalDate date2 = date1.plusMonths(1);
        assertEquals(Month.JANUARY,date1.getMonth());
        assertEquals(Month.FEBRUARY,date2.getMonth());
    }

    @Test
    public void periodos(){
        Period period = Period.ofMonths(2);
        LocalDate localDate1 = LocalDate.ofEpochDay(0);
        LocalDate localDate2 = localDate1.plusYears(1);

        int count = 0;
        while(localDate1.isBefore(localDate2)) {
            count++;
            localDate1 = localDate1.plus(period);
        }
        assertEquals(6,count);
    }


    @Test
    public void formateandoFechas(){

        LocalDate localDate = LocalDate.ofEpochDay(0).plusYears(45);

        DateTimeFormatter dtfShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter dtfMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(localDate.format(dtfShort));
        System.out.println(dtfMedium.format(localDate));
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

        //parse
        LocalDate bday = LocalDate.of(1990,12,19);
        assertEquals(bday,LocalDate.parse("1990-12-19",DateTimeFormatter.ISO_LOCAL_DATE));

         //nuevo of pattern
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' YYYY");


        DateTimeFormatter dtf2 = new DateTimeFormatterBuilder()
                .appendPattern("dd")
                .appendLiteral(" de ")
                .appendPattern("MMMM")
                .appendLiteral(" de ")
                .appendPattern("YYYY")
                .toFormatter();

        System.out.println(bday.format(dtf1));

        assertEquals(bday.format(dtf1),bday.format(dtf2));



    }


}
