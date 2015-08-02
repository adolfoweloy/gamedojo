package br.com.gamedojo.parser.processor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.parser.LineProcessor;
import br.com.gamedojo.util.DateUtil;

public class EndOfMatchProcessor extends LineProcessor {

    private final Pattern pattern = Pattern.compile("(.*?) - Match (\\d+) has ended");

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public void process(Game game, String line) {
        Matcher matcher = pattern.matcher(line);

        if (matcher.matches()) {
            String date = matcher.group(1);
            game.endMatch(DateUtil.parse(date));

        } else {
            throw new IllegalArgumentException(line);
        }

    }

}
