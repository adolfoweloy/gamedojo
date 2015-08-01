package br.com.gamedojo;

import static br.com.gamedojo.util.DateUtil.parse;
import br.com.gamedojo.model.game.Game;
import br.com.gamedojo.model.game.Match;
import br.com.gamedojo.model.game.Weapon;
import br.com.gamedojo.model.player.Player;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Match match = game.newMatch(parse("23/04/2013 15:34:22"), "11348965");

        Player roman = new Player("Roman");
        Player nick = new Player("Nick");
        Player fury = new Player("Fury");

        match.addEvent(roman.kill(nick).withWeaponAt(Weapon.M16, parse("23/04/2013 15:36:04")));
        match.addEvent(roman.kill(fury).withWeaponAt(Weapon.M16, parse("23/04/2013 15:36:04")));
        match.addEvent(fury.kill(nick).withWeaponAt(Weapon.M16, parse("23/04/2013 15:36:04")));
        match.addEvent(roman.kill(nick).withWeaponAt(Weapon.M16, parse("23/04/2013 15:36:04")));

        match.getStatistics().forEach(agent ->  {
            Player player = (Player) agent;
            String log = String.format("%s \t %d\t %d\t %s",
                    player.getName(), player.getKillings(), player.getDeaths(),
                    match.getStatistics().getPreferredWeaponFor(player).getName());
            System.out.println(log);
        });

    }

}
