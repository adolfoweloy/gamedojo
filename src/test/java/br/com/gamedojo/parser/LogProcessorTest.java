package br.com.gamedojo.parser;

import static br.com.gamedojo.parser.LogProcessor.getProcessor;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.gamedojo.parser.processor.EndOfMatchProcessor;
import br.com.gamedojo.parser.processor.NewMatchProcessor;
import br.com.gamedojo.parser.processor.PlayerKillingProcessor;
import br.com.gamedojo.parser.processor.WorldKillingProcessor;

public class LogProcessorTest {

    @Test
    public void shouldRetrieveLineProcessorForNewGame() {

        LineProcessor processor = getProcessor("23/04/2013 15:34:22 - New match 11348965 has started");
        assertTrue(processor instanceof NewMatchProcessor);

    }

    @Test
    public void shouldRetrieveLineProcessorForPlayerKillingAnotherPlayer() {

        LineProcessor processor = getProcessor("23/04/2013 15:36:04 - Roman killed Nick using M16");
        assertTrue(processor instanceof PlayerKillingProcessor);

    }

    @Test
    public void shouldRetrieveLineProcessorForWorldKillingAnotherPlayer() {

        LineProcessor processor = getProcessor("23/04/2013 15:36:33 - <WORLD> killed Nick by DROWN");
        assertNotNull(processor);
        assertTrue(processor instanceof WorldKillingProcessor);

    }

    @Test
    public void shouldRetrieveLineProcessorForEndOfMatch() {

        LineProcessor processor = getProcessor("23/04/2013 15:39:22 - Match 11348965 has ended");
        assertNotNull(processor);
        assertTrue(processor instanceof EndOfMatchProcessor);
    }

}
