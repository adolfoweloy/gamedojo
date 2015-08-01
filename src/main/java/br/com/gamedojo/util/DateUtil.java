package br.com.gamedojo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe criada para facilitar a recuperação de uma data formatada
 * @author aeloy
 */
public class DateUtil {

    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    /**
     * Recupera uma data a partir de uma string que esteja formatada com dd/MM/yyyy hh:mm:ss
     * @param stringDate
     * @return java.util.Date
     */
    public static Date parse(String stringDate) {

        try {
            return sdf.parse(stringDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
