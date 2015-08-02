package br.com.gamedojo.model.game;

import static br.com.gamedojo.model.game.Weapon.MAGIC;
import static br.com.gamedojo.model.game.Weapon.SWORD;
import static br.com.gamedojo.util.DateUtil.parse;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.model.game.Match;
import br.com.gamedojo.model.game.Weapon;
import br.com.gamedojo.model.player.Player;

public class MatchTest {

    @Test
    public void shouldRetrievePreferredWeapon() {
        Game game = new Game();
        Match match = game.newMatch(parse("23/04/2013 15:39:22"), "123");

        Player skull = new Player("Skull");
        Player vick = new Player("Vick a menina robo");
        Player kratos = new Player("Kratos");
        Player chapolim = new Player("Chapolim");

        match.addEvent(skull.kill(vick, SWORD, parse("23/04/2013 15:39:22")));
        match.addEvent(skull.kill(kratos, SWORD, parse("23/04/2013 15:39:22")));
        match.addEvent(skull.kill(chapolim, MAGIC, parse("23/04/2013 15:39:22")));

        Weapon preferred = match.getStatistics().getPreferredWeaponFor(skull);
        Assert.assertEquals(Weapon.SWORD, preferred);
    }

}
