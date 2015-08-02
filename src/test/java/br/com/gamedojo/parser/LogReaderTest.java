package br.com.gamedojo.parser;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

import br.com.gamedojo.model.game.Game;

public class LogReaderTest {

    @Test
    public void shouldReadAGameFromLogFile() throws IOException {

        try (LogReader reader = new LogReader(bufferedReader())) {
            Game game = reader.load();
            assertEquals(1, game.matches());

        }

    }

    private BufferedReader bufferedReader() {
        return new MockedBufferedReader(mock(Reader.class));
    }

}
