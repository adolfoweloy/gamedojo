package br.com.gamedojo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void shouldParseDateFromString() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String toBeFormated = "23/04/2013 15:34:22";
        Date actual = DateUtil.parse(toBeFormated);

        Assert.assertEquals(sdf.parse(toBeFormated), actual);
    }

}
