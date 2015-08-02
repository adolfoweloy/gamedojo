package br.com.gamedojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LogReader;

public class MainReader {

    public static void main(String[] args) throws IOException {

        InputStream is = MainReader.class.getClassLoader().getResourceAsStream("input.txt");

        try (LogReader reader = new LogReader(new BufferedReader(new InputStreamReader(is)))) {
            Game game = reader.load();
            game.forEach((match) -> match.getStatistics().forEach(new StatisticsPrinter(match)));
        }

    }

}
