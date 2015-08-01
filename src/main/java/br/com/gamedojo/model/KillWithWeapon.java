package br.com.gamedojo.model;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.Weapon;

public interface KillWithWeapon {

    KillingEvent withWeaponAt(Weapon weapon, Date date);

}