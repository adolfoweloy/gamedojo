package br.com.gamedojo.parser.processor;

import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LineProcessor;

public class InvalidProcessor extends LineProcessor {

    private final Pattern invalidPattern = Pattern.compile("\\s");

    @Override
    public Pattern getPattern() {
        return invalidPattern;
    }

    @Override
    public void process(Game game, String line) {
        // TODO Auto-generated method stub

    }

}
