package br.com.gamedojo.parser;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

import br.com.gamedojo.model.game.Game;

public class LogReader implements Closeable {

    private BufferedReader bufferedReader;

    public LogReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public Game load() throws IOException {
        Game game = new Game();
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            Processor processor = LogProcessor.getProcessor(line);
            // TODO - comportamento mutavel (pesquisar uma alternativa pra esse caso)
            processor.process(game);
        }

        return game;
    }

    @Override
    public void close() throws IOException {
        this.bufferedReader.close();
    }

}
