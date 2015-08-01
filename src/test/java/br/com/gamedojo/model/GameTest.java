package br.com.gamedojo.model;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.model.Game;
import br.com.gamedojo.model.Match;
import br.com.gamedojo.util.DateUtil;

public class GameTest {

    @Test
    public void shouldCreateANewMatch() {
        String id = "11348965";
        Date time = DateUtil.parse("23/04/2013 15:34:22");

        Game game = new Game();
        Match match = game.newMatch(time, id);
        Assert.assertEquals(id, match.getId());
        Assert.assertEquals(time, match.getStartTime());
    }

}
