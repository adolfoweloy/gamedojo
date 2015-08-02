package br.com.gamedojo.parser.processor;

import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LineProcessor;

public class EndOfMatchProcessor extends LineProcessor {

    private final Pattern pattern = Pattern.compile("(.*?) - Match (\\d+) has ended");

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public void process(Game game, String line) {
        // TODO Auto-generated method stub

    }

}
