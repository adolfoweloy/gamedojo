package br.com.gamedojo.model.player;

import static br.com.gamedojo.util.DateUtil.parse;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.weapon.Weapons;
import br.com.gamedojo.util.DateUtil;

public class PlayerTest {

    private static final String DATE_TIME = "23/04/2013 15:39:22";

    @Test
    public void shouldKillTwoPlayersAndDieOnce() {
        Player hook = new Player("Hook");
        hook.kill(new Player("Pawn"), Weapons.M16.getWeapon(), parse(DATE_TIME));
        hook.kill(new Player("Horse"), Weapons.M16.getWeapon(), parse(DATE_TIME));

        Player bishop = new Player("Bishop");
        bishop.kill(hook, Weapons.M16.getWeapon(), DateUtil.parse(DATE_TIME));

        Assert.assertEquals(1, hook.getDeaths());
        Assert.assertEquals(2, hook.getKillings());
    }

    @Test
    public void shouldGenerateAKillingEvent() {
        Player ladyBug = new Player("Lady Bug");
        Player mustache = new Player("Mustache");

        KillingEvent event = ladyBug.kill(mustache,
                Weapons.MAGIC.getWeapon(), parse(DATE_TIME));

        Assert.assertNotNull(event);
        Assert.assertEquals(ladyBug, event.getKiller());
        Assert.assertEquals(mustache, event.getKilled());
        Assert.assertEquals(parse(DATE_TIME), event.getTime());

    }
}
