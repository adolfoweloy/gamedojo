package br.com.gamedojo.parser.processor;

import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LineProcessor;

public class NewMatchProcessor extends LineProcessor {

    @Override
    public Pattern getPattern() {
        return null;
    }

    @Override
    public void process(Game game, String line) {

    }

}
