package br.com.gamedojo.model.event;

import java.util.Date;

import br.com.gamedojo.model.Agent;
import br.com.gamedojo.model.Weapon;

public class PlayerKillingEvent implements KillingEvent {

    private Agent killer;
    private Agent killed;
    private Date time;
    private Weapon weapon;

    public PlayerKillingEvent(Agent killer, Agent killed, Date time) {
        super();
        this.killer = killer;
        this.killed = killed;
        this.time = time;
    }

    /* (non-Javadoc)
     * @see br.com.gamedojo.model.KillingEvent#getKiller()
     */
    @Override
    public Agent getKiller() {
        return killer;
    }

    /* (non-Javadoc)
     * @see br.com.gamedojo.model.KillingEvent#getKilled()
     */
    @Override
    public Agent getKilled() {
        return killed;
    }

    /* (non-Javadoc)
     * @see br.com.gamedojo.model.KillingEvent#getTime()
     */
    @Override
    public Date getTime() {
        return time;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

}
