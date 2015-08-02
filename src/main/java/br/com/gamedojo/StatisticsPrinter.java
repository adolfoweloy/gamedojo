package br.com.gamedojo;

import java.util.function.Consumer;

import br.com.gamedojo.model.game.Agent;
import br.com.gamedojo.model.game.Match;
import br.com.gamedojo.model.player.Player;

/**
 * Classe que imprime dados estatisticos de agente.
 * @author aeloy
 */
class StatisticsPrinter implements Consumer<Agent> {
    private Match match;

    public StatisticsPrinter(Match match) {
        this.match = match;
    }

    @Override
    public void accept(Agent agent) {
        Player player = (Player) agent;
        String log = String.format("%s \t %d\t %d\t %s",
                player.getName(), player.getKillings(), player.getDeaths(),
                match.getStatistics().getPreferredWeaponFor(player).getName());

        System.out.println(log);
    }

}