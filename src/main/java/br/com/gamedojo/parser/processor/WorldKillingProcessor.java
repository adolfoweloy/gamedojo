package br.com.gamedojo.parser.processor;

import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LineProcessor;

public class WorldKillingProcessor extends LineProcessor {

    private final Pattern pattern = Pattern.compile("(.*?) - <WORLD> killed (\\w+) by DROWN");

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public void process(Game game, String line) {

    }

}
