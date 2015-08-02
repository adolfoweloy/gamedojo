package br.com.gamedojo.model.game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.gamedojo.util.DateUtil;

public class GameTest {

    private final String id = "11348965";
    private final Date time = DateUtil.parse("23/04/2013 15:34:22");

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void shouldCreateANewMatch() {
        Match match = game.newMatch(time, id);
        assertNotNull(match);
    }

    @Test
    public void shouldCreateANewMatchWithValidId() {
        Match match = game.newMatch(time, id);
        assertEquals(id, match.getId());
    }

    @Test
    public void shouldCreateANewMatchWithValidStartTime() {
        Match match = game.newMatch(time, id);
        assertEquals(time, match.getStartTime());
    }

    @Test
    public void shouldFinishAGameWithDateAndTime() {
        Match match = game.newMatch(time, id);
        match.finish(DateUtil.parse("23/04/2013 15:39:22"));

        assertEquals(DateUtil.parse("23/04/2013 15:39:22"), match.getEndTime());
    }

    @Test
    public void shouldCreateTwoMatches() {
        game.newMatch(time, id);
        game.endMatch(time);

        game.newMatch(time, id);
        game.endMatch(time);

        assertEquals(2, game.matchers());
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowIllegalStateExceptionWhenTryingToFinishAnInexistentMatch() {
        game.endMatch(time);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenTryingToFinishMatchForTheSecondTime() {
        game.newMatch(time, id);
        game.endMatch(time);
        game.endMatch(time);
    }
}
