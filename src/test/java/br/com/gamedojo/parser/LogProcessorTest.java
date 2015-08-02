package br.com.gamedojo.parser;

import static br.com.gamedojo.parser.LogProcessor.getProcessor;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LogProcessorTest {

    @Test
    public void shouldRetrieveLineProcessorForNewGame() {

        LineProcessor processor = getProcessor("23/04/2013 15:34:22 - New match 11348965 has started");
        assertNotNull(processor);

    }

    @Test
    public void shouldRetrieveLineProcessorForPlayerKillingAnotherPlayer() {

        LineProcessor processor = getProcessor("23/04/2013 15:36:04 - Roman killed Nick using M16");
        assertNotNull(processor);

    }
}
