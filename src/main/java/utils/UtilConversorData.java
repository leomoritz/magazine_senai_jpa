package utils;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class UtilConversorData {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String ConverteDataParaString(LocalDate data){

        return dtf.format(data);

    }

    public static LocalDate ConverteStringParaData(String data){
        return LocalDate.parse(data, dtf);
    }

}
