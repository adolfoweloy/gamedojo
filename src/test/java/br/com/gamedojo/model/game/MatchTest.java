package br.com.gamedojo.model.game;

import static br.com.gamedojo.model.game.weapon.Weapons.MAGIC;
import static br.com.gamedojo.model.game.weapon.Weapons.SWORD;
import static br.com.gamedojo.util.DateUtil.parse;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.model.game.weapon.Weapon;
import br.com.gamedojo.model.game.weapon.Weapons;
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

        match.addEvent(skull.kill(vick, SWORD.getWeapon(), parse("23/04/2013 15:39:22")));
        match.addEvent(skull.kill(kratos, SWORD.getWeapon(), parse("23/04/2013 15:39:22")));
        match.addEvent(skull.kill(chapolim, MAGIC.getWeapon(), parse("23/04/2013 15:39:22")));

        Weapon preferred = match.getStatistics().getPreferredWeaponFor(skull);
        Assert.assertEquals(Weapons.SWORD.getWeapon(), preferred);
    }

}
