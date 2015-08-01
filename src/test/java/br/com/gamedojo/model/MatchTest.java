package br.com.gamedojo.model;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.com.gamedojo.util.DateUtil;

public class MatchTest {

    @Test
    public void shouldAddEventsForMatch() {

        String id = "11348965";
        Date time = DateUtil.parse("23/04/2013 15:34:22");
        Date killingTime = DateUtil.parse("23/04/2013 15:35:22");

        Game game = new Game();
        Match match = game.newMatch(time, id);
        //        match.notifyKilling(new PlayerKillingEvent(playerOne(), playerTwo(), killingTime));

        //        match.forEach(agent -> {
        //            System.out.println(agent.getName());
        //        });

        Assert.fail("nao testa testando nada isso ainda");
    }

    private Agent playerTwo() {
        return new Player("Roman");
    }

    private Agent playerOne() {
        return new Player("Nick");
    }

}
