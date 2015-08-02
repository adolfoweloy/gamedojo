package br.com.gamedojo.parser.processor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.model.game.weapon.Weapons;
import br.com.gamedojo.model.player.Player;
import br.com.gamedojo.model.world.World;
import br.com.gamedojo.parser.LineProcessor;
import br.com.gamedojo.util.DateUtil;

public class WorldKillingProcessor extends LineProcessor {

    private final Pattern pattern = Pattern.compile("(.*?) - <WORLD> killed (\\w+) by DROWN");

    @Override
    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public void process(Game game, String line) {
        Matcher matcher = pattern.matcher(line);

        if (matcher.matches()) {
            String date = matcher.group(1);
            String killed = matcher.group(2);

            game.kill(
                    new World(),
                    new Player(killed),
                    Weapons.INVALID.getWeapon(), // TODO - precisa ver isso aih hein cara
                    DateUtil.parse(date));

        } else {
            throw new IllegalArgumentException(line);
        }

    }

}
