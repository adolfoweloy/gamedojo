package br.com.gamedojo.model;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.model.game.Weapon;
import br.com.gamedojo.model.player.Player;
import br.com.gamedojo.util.DateUtil;

public class PlayerTest {

    @Test
    public void shouldKillTwoPlayersAndDieOnce() {
        Player rook = new Player("Rook");
        rook.kill(new Player("Pawn"), Weapon.M16, DateUtil.parse("23/04/2013 15:39:22"));
        rook.kill(new Player("Horse"), Weapon.M16, DateUtil.parse("23/04/2013 15:39:22"));

        Player bishop = new Player("Bishop");
        bishop.kill(rook, Weapon.M16, DateUtil.parse("23/04/2013 15:39:22"));

        Assert.assertEquals(1, rook.getDeaths());
        Assert.assertEquals(2, rook.getKillings());
    }

}
