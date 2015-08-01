package br.com.gamedojo.model;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.model.player.Player;

public class PlayerTest {

    @Test
    public void shouldKillTwoPlayersAndDieOnce() {
        Player rook = new Player("Rook");
        rook.kill(new Player("Pawn"));
        rook.kill(new Player("Horse"));

        Player bishop = new Player("Bishop");
        bishop.kill(rook);

        Assert.assertEquals(1, rook.getDeaths());
        Assert.assertEquals(2, rook.getKillings());
    }

}
