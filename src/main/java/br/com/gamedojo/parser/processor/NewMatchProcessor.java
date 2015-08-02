package br.com.gamedojo.parser.processor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LineProcessor;
import br.com.gamedojo.util.DateUtil;

public class NewMatchProcessor extends LineProcessor {

    private final Pattern pattern = Pattern.compile("(.*?) - New match (\\d+) has started");

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public void process(Game game, String line) {

        Matcher matcher = pattern.matcher(line);

        if (matcher.matches()) {
            String date = matcher.group(1);
            String gameID = matcher.group(2);
            game.newMatch(DateUtil.parse(date), gameID);
        } else {
            throw new IllegalArgumentException(line);
        }

    }

}