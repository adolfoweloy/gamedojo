package br.com.gamedojo.parser.processor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.model.game.weapon.Weapon;
import br.com.gamedojo.model.player.Player;
import br.com.gamedojo.parser.LineProcessor;
import br.com.gamedojo.util.DateUtil;

public class PlayerKillingProcessor extends LineProcessor {

    private final Pattern pattern = Pattern.compile("(.*?) - (\\w+) killed (\\w+) using (\\w+)");

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public void process(Game game, String line) {
        Matcher matcher = pattern.matcher(line);

        if (matcher.matches()) {
            String date = matcher.group(1);
            String playerOneName = matcher.group(2);
            String playerTwoName = matcher.group(3);
            String weaponName = matcher.group(4);

            game.kill(
                    new Player(playerOneName),
                    new Player(playerTwoName),
                    new Weapon(weaponName),
                    DateUtil.parse(date));

        } else {
            throw new IllegalArgumentException(line);
        }

    }

}
